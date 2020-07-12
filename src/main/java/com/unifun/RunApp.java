package com.unifun;

import lombok.extern.java.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
@Log
public class RunApp {
    public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    log.info("Candidate A : ");
    int numA = Integer.parseInt(reader.readLine());
    log.info("Candidate B : ");
    int numB = Integer.parseInt(reader.readLine());




    Percentage.showResult(numA,numB);
    }
}
