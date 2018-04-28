package com.gaochao.bean;

import java.io.Serializable;

/**
 * Created by smileMAC on 18/4/26.
 */
public class Analyser implements Serializable {
    private int id;			//id
    private String ip;		// IP地址
    private int port;		// 端口
    private String name;	// 分析仪姓名
    private Double cpu;		// CPU使用率
    private Double mem;		// 内存使用率
    private int state;		// 状态

    public Analyser(int id, String ip, int port, String name, Double cpu, Double mem, int state) {
        super();
        this.id = id;
        this.ip = ip;
        this.port = port;
        this.name = name;
        this.cpu = cpu;
        this.mem = mem;
        this.state = state;
    }

    public Analyser() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public int getPort() {
        return port;
    }
    public void setPort(int port) {
        this.port = port;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getCpu() {
        return cpu;
    }
    public void setCpu(Double cpu) {
        this.cpu = cpu;
    }
    public Double getMem() {
        return mem;
    }
    public void setMem(Double mem) {
        this.mem = mem;
    }
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
    }
    @Override
    public String toString() {
        return "Analyser [id=" + id + ", ip=" + ip + ", port=" + port + ", name=" + name + ", cpu=" + cpu + ", mem="
                + mem + ", state=" + state + "]";
    }
}
