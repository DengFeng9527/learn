package com.tedu;/**
 * @author liudf
 * @date 2021/8/3
 */

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @Title:UdpSocketServer
 * @Description TODO
 * @Version 1.0
 **/
public class UdpSocketServer {
    public static void main(String[] args) throws IOException {
        System.out.println("udp服务器端启动连接....");
        DatagramSocket ds = new DatagramSocket(8080);
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        // 阻塞,等待接受客户端发送请求
        ds.receive(dp);
        System.out.println("来源:"+dp.getAddress()+",端口号:"+dp.getPort());
        // 获取客户端请求内容
        String str=new String(dp.getData(),0,dp.getLength());
        System.out.println("str:"+str);
        ds.close();
    }


}
