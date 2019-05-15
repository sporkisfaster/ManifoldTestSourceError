package com.someclient.example.manifoldmain;
import integration.Manifolds.Ps01Blank;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestJSON {
    public static void main(String[] args) {


    System.out.println(TestJSON.getResult());

 }

public static String getResult() {
        String result;
        Path dir = Paths.get("src","main","resources","integration","Manifolds","Ps01Blank.json");

        Ps01Blank test = Ps01Blank.load().fromJsonFile(new File(dir.toString()));
        result = test.write().toJson();
        return result;
    }
}
