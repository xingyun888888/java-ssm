package com.gaochao.bean;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by smileMAC on 18/4/25.
 */
@Component
public class Camera implements Serializable{

    private int id;				//id
    private String type;		// camera type
    private String name;		// camera name
    private String serialNum;	// camera serial number
    private String ip;			// camera ip
    private int port;			//camera port
    private String mediaIP; 	//media server ip
    private int mediaPort;		//media server port
    private String direction;		// camera direction
    private int analyserID;		// 	corresponding analyser id
    private int zoneID;			// corresponding zone id
    private int strategyID;		//corresponding strategy id
    private int doorID;			// corresponding door id
    private String user;		// login  user
    private String pwd;			//login  password
    private int rtspPort;		// Rtsp  port
    private String rtspPath;	// resp path
    private String camInfo;		// camera description
    private int camMapX;		//camera x  co-ordinates
    private int camMapY;		//camera y  co-ordinates
    private int camState;		//camera state
    private int streamType;		//camera type
    private int districtID;		// corresponding district id
    private String districtName;// corresponding district name
    private String area;		// corresponding area
    private int areaID;  		//corresponding area id
    private String areaName;	// corresponding area name
    private String distictUrl;	//corresponding distict  address
    private String img_url;		//corresponding img address
    private Analyser analyser;

    public Analyser getAnalyser() {
        return analyser;
    }

    public void setAnalyser(Analyser analyser) {
        this.analyser = analyser;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSerialNum() {
        return serialNum;
    }
    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
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
    public String getMediaIP() {
        return mediaIP;
    }
    public void setMediaIP(String mediaIP) {
        this.mediaIP = mediaIP;
    }
    public int getMediaPort() {
        return mediaPort;
    }
    public void setMediaPort(int mediaPort) {
        this.mediaPort = mediaPort;
    }
    public String getDirection() {
        return direction;
    }
    public void setDirection(String direction) {
        this.direction = direction;
    }
    public int getAnalyserID() {
        return analyserID;
    }
    public void setAnalyserID(int analyserID) {
        this.analyserID = analyserID;
    }
    public int getZoneID() {
        return zoneID;
    }
    public void setZoneID(int zoneID) {
        this.zoneID = zoneID;
    }
    public int getStrategyID() {
        return strategyID;
    }
    public void setStrategyID(int strategyID) {
        this.strategyID = strategyID;
    }
    public int getDoorID() {
        return doorID;
    }
    public void setDoorID(int doorID) {
        this.doorID = doorID;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public int getRtspPort() {
        return rtspPort;
    }
    public void setRtspPort(int rtspPort) {
        this.rtspPort = rtspPort;
    }
    public String getRtspPath() {
        return rtspPath;
    }
    public void setRtspPath(String rtspPath) {
        this.rtspPath = rtspPath;
    }
    public String getCamInfo() {
        return camInfo;
    }
    public void setCamInfo(String camInfo) {
        this.camInfo = camInfo;
    }
    public int getCamMapX() {
        return camMapX;
    }
    public void setCamMapX(int camMapX) {
        this.camMapX = camMapX;
    }
    public int getCamMapY() {
        return camMapY;
    }
    public void setCamMapY(int camMapY) {
        this.camMapY = camMapY;
    }
    public int getCamState() {
        return camState;
    }
    public void setCamState(int camState) {
        this.camState = camState;
    }
    public int getStreamType() {
        return streamType;
    }
    public void setStreamType(int streamType) {
        this.streamType = streamType;
    }
    public int getDistrictID() {
        return districtID;
    }
    public void setDistrictID(int districtID) {
        this.districtID = districtID;
    }
    public String getDistrictName() {
        return districtName;
    }
    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public int getAreaID() {
        return areaID;
    }
    public void setAreaID(int areaID) {
        this.areaID = areaID;
    }
    public String getAreaName() {
        return areaName;
    }
    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }
    public String getDistictUrl() {
        return distictUrl;
    }
    public void setDistictUrl(String distictUrl) {
        this.distictUrl = distictUrl;
    }
    public String getImg_url() {
        return img_url;
    }
    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    Camera(){

    }

    public Camera(int id, String type, String name, String serialNum, String ip, int port, String mediaIP, int mediaPort, String direction, int analyserID, int zoneID, int strategyID, int doorID, String user, String pwd, int rtspPort, String rtspPath, String camInfo, int camMapX, int camMapY, int camState, int streamType, int districtID, String districtName, String area, int areaID, String areaName, String distictUrl, String img_url, Analyser analyser) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.serialNum = serialNum;
        this.ip = ip;
        this.port = port;
        this.mediaIP = mediaIP;
        this.mediaPort = mediaPort;
        this.direction = direction;
        this.analyserID = analyserID;
        this.zoneID = zoneID;
        this.strategyID = strategyID;
        this.doorID = doorID;
        this.user = user;
        this.pwd = pwd;
        this.rtspPort = rtspPort;
        this.rtspPath = rtspPath;
        this.camInfo = camInfo;
        this.camMapX = camMapX;
        this.camMapY = camMapY;
        this.camState = camState;
        this.streamType = streamType;
        this.districtID = districtID;
        this.districtName = districtName;
        this.area = area;
        this.areaID = areaID;
        this.areaName = areaName;
        this.distictUrl = distictUrl;
        this.img_url = img_url;
        this.analyser = analyser;
    }
}
