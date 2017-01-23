package org.tcat.ueditor.controller.common;


import org.apache.commons.collections.map.HashedMap;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.Map;
import java.util.Random;

@RestController
@RequestMapping("file")
public class FastFDSController {

    @PostMapping(value = "uploadSingleImage")
    public ResponseEntity<Object> uploadSingleImage(MultipartHttpServletRequest request) {

        //TODO:上传图片

        Map<String, Object> resultMap = new HashedMap();
        if (true) {
            resultMap.put("state", "SUCCESS");
            resultMap.put("url", "/static/images/test/test (" + (new Random().nextInt(8)+1) + ").jpg");
            resultMap.put("title", "test");
            resultMap.put("original", "test");
        } else {
            resultMap.put("state", "ERRNO");
            resultMap.put("url", "");
            resultMap.put("title", "test");
            resultMap.put("original", "test");
        }
        return ResponseEntity.ok(resultMap);
    }

}
