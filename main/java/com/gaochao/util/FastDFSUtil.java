package com.gaochao.util;

import org.apache.commons.io.FilenameUtils;
import org.csource.common.NameValuePair;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient1;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.springframework.core.io.ClassPathResource;

import java.io.Serializable;

/**
 * Created by smileMAC on 18/5/1.
 */
public class FastDFSUtil implements Serializable{
    private static final long serialVersionUID = -4462272673174266738L;
    private static TrackerClient trackerClient;
    private static TrackerServer trackerServer;
    private static StorageClient1 storageClient1;

    static {
        try {
            //clientGloble读配置文件
            ClassPathResource resource = new ClassPathResource("fdfs_client.conf");
            ClientGlobal.init(resource.getClassLoader().getResource("fdfs_client.conf").getPath());
            //trackerclient
            trackerClient = new TrackerClient();
            trackerServer = trackerClient.getConnection();
            //storageclient
            storageClient1 = new StorageClient1(trackerServer,null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * fastDFS文件上传
     * @param file 上传的文件 FastDFSFile
     * @return String 返回文件的绝对路径
     */
    public static String uploadFile(FastDFSFile file){
        String path = null;
        try {
            //文件扩展名
            String ext = FilenameUtils.getExtension(file.getName());
            //mata list是表文件的描述
            NameValuePair[] mata_list = new NameValuePair[3];
            mata_list[0] = new NameValuePair("fileName",file.getName());
            mata_list[1] = new NameValuePair("fileExt",ext);
            mata_list[2] = new NameValuePair("fileSize",String.valueOf(file.getSize()));
            path = storageClient1.upload_file1(file.getContent(), ext, mata_list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return path;
    }


}
