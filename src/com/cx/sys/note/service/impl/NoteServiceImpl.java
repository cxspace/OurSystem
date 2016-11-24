package com.cx.sys.note.service.impl;

import com.cx.core.service.BaseService;
import com.cx.core.service.impl.BaseServiceImpl;
import com.cx.core.utils.ExcelUtils;
import com.cx.sys.note.dao.NoteDao;
import com.cx.sys.note.entity.Note;
import com.cx.sys.note.service.NoteService;
import com.cx.sys.user.entity.User;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by cxspace on 16-11-17.
 */

@Service("noteService")
public class NoteServiceImpl extends BaseServiceImpl<Note> implements NoteService{

    private NoteDao noteDao;

    @Resource

    public void setNoteDao(NoteDao noteDao) {
        super.setBaseDao(noteDao);
        this.noteDao = noteDao;
    }

    @Override
    public void exportExcel(List<Note> noteList, ServletOutputStream outputStream) {
        ExcelUtils.exportNoteExcel(noteList,outputStream);
    }

    @Override
    public void importExcel(File userExcel, String fileType) {

        try {

            FileInputStream fileInputStream = new FileInputStream(userExcel);

            boolean is03Excel = fileType.equals(".xls");

            Workbook workbook = is03Excel ? new HSSFWorkbook(fileInputStream) : new XSSFWorkbook(fileInputStream);

            //读取第一个工作表
            Sheet sheet = workbook.getSheetAt(0);

            Note note = null;

            for (int i = 0 ; i < sheet.getPhysicalNumberOfRows() ; i++){

                Row row = sheet.getRow(i);

                note = new Note();

                Cell cell1 = row.getCell(0);

                System.out.println(findObjectById(cell1.getStringCellValue()));

                if (findObjectById(cell1.getStringCellValue())==null){

                    note.setId(cell1.getStringCellValue());

                    Cell cell2 = row.getCell(1);

                    note.setName(cell2.getStringCellValue());

                    //时间还是拿当前时间
                    note.setTime(new Timestamp(new Date().getTime()));

                    Cell cell4 = row.getCell(3);

                    note.setCreate_person(cell4.getStringCellValue());

                    Cell cell5 = row.getCell(4);

                    note.setNote_class(cell5.getStringCellValue());

                    Cell cell6 = row.getCell(5);

                    note.setContent(cell6.getStringCellValue());

                    //保存恢复的数据
                    save(note);

              }

            }
            workbook.close();
            fileInputStream.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
