package com.cx.core.utils;

import com.cx.sys.note.entity.Note;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import javax.servlet.ServletOutputStream;
import java.util.List;

/**
 * Created by cxspace on 16-11-23.
 */
public class ExcelUtils {

    public static void exportNoteExcel(List<Note> noteList , ServletOutputStream outputStream){

        // 创建工作薄

        HSSFWorkbook workbook = new HSSFWorkbook();

        //创建工作表

        HSSFSheet sheet = workbook.createSheet("所有笔记列表");

        if (noteList!=null){

            for (int i = 0 ; i < noteList.size() ; i ++){

                HSSFRow row = sheet.createRow(i);

                //把笔记列表值拿出来列表
                HSSFCell cell1 = row.createCell(0);
                cell1.setCellValue(noteList.get(i).getId());

                HSSFCell cell2 = row.createCell(1);
                cell2.setCellValue(noteList.get(i).getName());

                HSSFCell cell3 = row.createCell(2);
                cell3.setCellValue(noteList.get(i).getTime());

                HSSFCell cell4 = row.createCell(3);
                cell4.setCellValue(noteList.get(i).getCreate_person());

                HSSFCell cell5 = row.createCell(4);
                cell5.setCellValue(noteList.get(i).getNote_class());

                HSSFCell cell6 = row.createCell(5);
                cell6.setCellValue(noteList.get(i).getContent());

            }

            //输出
            try {

                workbook.write(outputStream);
                workbook.close();

            }catch (Exception e){
                e.printStackTrace();
            }

        }


    }


}
