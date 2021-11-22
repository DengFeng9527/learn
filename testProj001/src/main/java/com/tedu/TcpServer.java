//package com.tedu;/**
// * @author liudf
// * @date 2021/8/3
// */
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.net.ServerSocket;
//import java.net.Socket;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
///**
// * @Title:TcpServer
// * @Description TODO
// * @Version 1.0
// **/
//public class TcpServer {
////    public static void main(String[] args) throws IOException {
////        System.out.println("socket tcp服务器端启动....");
////        ServerSocket serverSocket = new ServerSocket(8083);
////        // 等待客户端请求
////        Socket accept = serverSocket.accept();
////        InputStream inputStream = accept.getInputStream();
////        // 转换成string类型
////        byte[] buf = new byte[1024];
////        int len = inputStream.read(buf);
////        String str = new String(buf, 0, len);
////        System.out.println("服务器接受客户端内容:" + str);
////        serverSocket.close();
////    }
//public static void main(String[] args) throws IOException {
//    System.out.println("tcp协议服务器端启动..");
//    ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
//    // 创建服务器端连接
//    ServerSocket serverSocket = new ServerSocket(8080);
//    try {
////		    while (true) {
//        // 接受客户端请求 阻塞功能
//        Socket accept = serverSocket.accept();
//        newCachedThreadPool.execute(new Runnable(){
//
//          //  @Override
//            public void run() {
//                try {
//                    InputStream inputStream = accept.getInputStream();
//                    // 将字节流转换成String类型
//                    byte[] bytes = new byte[1024];
//                    int len = inputStream.read(bytes);
//                    String result=new String(bytes,0,len);
//                    System.out.println("服务器端接受客户端内容:"+result);
//                    OutputStream outputStream = accept.getOutputStream();
//                    outputStream.write("this is yes itmayiedu.com".getBytes());
//                } catch (Exception e) {
//                    // TODO: handle exception
//                }
//
//            }
//        });
//
////			}
//    } catch (Exception e) {
//        // TODO: handle exception
//    }finally {
//        serverSocket.close();
//    }
//
//}
//
//
//}
