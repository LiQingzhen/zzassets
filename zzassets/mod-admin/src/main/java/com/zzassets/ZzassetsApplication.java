package com.zzassets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author ruoyi
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class ZzassetsApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(ZzassetsApplication.class, args);
        System.out.println("  ____________          _____ _____ ______ _______ _____ \n" +
                " |___  /___  /   /\\    / ____/ ____|  ____|__   __/ ____|\n" +
                "    / /   / /   /  \\  | (___| (___ | |__     | | | (___  \n" +
                "   / /   / /   / /\\ \\  \\___ \\\\___ \\|  __|    | |  \\___ \\ \n" +
                "  / /__ / /__ / ____ \\ ____) |___) | |____   | |  ____) |\n" +
                " /_____/_____/_/    \\_\\_____/_____/|______|  |_| |_____/ \n" +
                "                                                         ");
    }
}
