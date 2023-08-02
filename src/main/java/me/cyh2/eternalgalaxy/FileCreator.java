package me.cyh2.eternalgalaxy;

import java.io.File;
import java.io.IOException;

import static me.cyh2.eternalgalaxy.EternalGalaxy.logger;

public class FileCreator {
    public static File create(String arg) {
        File file;
        try {
            file = new File(arg);

            if (file.createNewFile()) {
                logger.info("保存了文件:" + arg + "！");
            } else {
                logger.info("读取了文件：" + arg + "！");
            }
            return file;
        } catch (IOException e) {
            logger.info("在尝试读取或新建文件时发生了错误：" + e.getMessage());
            return null;
        }
    }
}