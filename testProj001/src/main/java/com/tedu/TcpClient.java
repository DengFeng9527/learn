package com.tedu;/**
 * @author liudf
 * @date 2021/8/3
 */

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Title:TcpClient
 * @Description TODO
 * @Version 1.0
 **/
public class TcpClient {
    public static void main(String[] args) throws UnknownHostException, IOException {
        System.out.println("socket tcp 客户端启动....");
        Socket socket = new Socket("127.0.0.1", 8083);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("我是蚂蚁课堂".getBytes());
        socket.close();
    }

}
