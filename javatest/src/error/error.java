package src.error;

import com.sun.tools.javac.Main;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import src.main.main;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;

public class error {
    public static void main(String[] args) {
//        Exception origin = null;
//
//        try {
//            byte[] bs = toGBK("1212da1s3d1as321da31da1das21das3da132d");
//            process2();
//        }catch(NullPointerException e){
//            origin = e;
//            throw e;
//        }finally{
//            Exception e = new IllegalArgumentException();
//            if(origin!= null){
//                e.addSuppressed(origin);
//            }
//            throw e;
//        }
//
//        try{
//            process3(-1);
//        }catch(IllegalArgumentException e){
//            e.printStackTrace();
//            System.out.println("抛出错误");
//        }
//
//        String s = null;
//        System.out.println(s.toLowerCase());
//        int x = 100;
//        assert x<=0;// 断言 结果为true则执行，为false则抛出AssertionError,还可以添加一个断言消息
//        System.out.println(x);
//
//        Logger logger = Logger.getGlobal();
//        logger.info("start process....");
//        logger.warning("memory is running out...");
//        logger.fine("ignored");
//        logger.severe("process will be terminated");
//
//        Logger logger = Logger.getLogger(error.class.getName());
//        logger.info("Start process...");
//        try {
//            "".getBytes("invalidCharsetName");
//        } catch (UnsupportedEncodingException e) {
//            logger.severe(e.toString());
//            // TODO: 使用logger.severe()打印异常
//        }
//        logger.info("Process end.");
        Log log = LogFactory.getLog(error.class);
        log.info("start...");
        log.warn("end...");


    }
    static byte[] toGBK(String s) throws UnsupportedEncodingException{
        return s.getBytes("GBK");
    }
    static void process2(){
//            NullPointerException e = new NullPointerException();
//            throw e;
            //合并为一行
            throw new NullPointerException();
    }
    static void process3(int a){
        if(a<0){
            throw new IllegalArgumentException("a<0");
        }

    }
}
