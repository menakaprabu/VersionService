package com.version.versionService.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @RequestMapping(value = "/versionCheck/{version1}/{version2}")
    public String validateVersion(@PathVariable String version1, @PathVariable String version2) {
        try {
           int output = compareVersion(version1, version2);
           System.out.println("Output = "+output);
           if(output == -1){
                return version1 + " is before " + version2;
            }else if(output == 1){
                return version1 + " is after " + version2;
            }else{
                return version1 + " is equal to " + version2;
            }
        }catch (Exception e){
            return "Please check the input entered..";
        }
    }

    @RequestMapping(value = "/versionCheck/{version1}/")
    public String exceptionForWrongInput(@PathVariable String version1) {
            return "You should enter 2 version values to compare";
    }

    /**
     * Compare two version numbers version1 and version2.
     * If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.
     * @param version1
     * @param version2
     * @return
     */
    private int compareVersion(String version1, String version2) {
        String[] verArr1 = version1.split("\\.");
        String[] verArr2 = version2.split("\\.");

        int i=0;
        while(i<verArr1.length || i<verArr2.length){
            if(i<verArr1.length && i<verArr2.length){
                if(Integer.parseInt(verArr1[i]) < Integer.parseInt(verArr2[i])){
                    return -1;
                }else if(Integer.parseInt(verArr1[i]) > Integer.parseInt(verArr2[i])){
                    return 1;
                }
            } else if(i<verArr1.length){
                if(Integer.parseInt(verArr1[i]) != 0){
                    return 1;
                }
            } else if(i<verArr2.length){
                if(Integer.parseInt(verArr2[i]) != 0){
                    return -1;
                }
            }
            i++;
        }
        return 0;
    }
}
