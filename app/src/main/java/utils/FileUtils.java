package utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/9/27.
 */
public class FileUtils {


    //写文件
    public static void writeString(String fileName, String content) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(fileName);
            fileOutputStream.write(content.getBytes());
            fileOutputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    //获取某个目录所有的图片
    public static final List<File> getAllPic(String dir) {
        return getAllPic(new File(dir));
    }

    //获取某个目录所有的图片
    public static final List<File> getAllPic(File dir) {
        if (!dir.exists())
            return null;
        else if (!dir.isDirectory()) {
            return null;
        }
        List<File> list = new ArrayList<>();
        digui(list, dir);
        return list;
    }


    private static final void digui(List<File> list, File dir) {
        //1.获取子目录和子文件
        File[] files = dir.listFiles();
        //如果是空文件夹会返回null
        if (files == null)
            return;
        for (File file : files) {
            if (file.isDirectory())
                digui(list, file);
            else {
                String name = file.getName();
                if (name.endsWith(".png") || name.endsWith(".jpg") || name.endsWith(".gif"))
                    list.add(file);
            }
        }
    }
}
