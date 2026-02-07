package com.example.ocr.controller;

import com.example.ocr.model.Receipt;
import com.example.ocr.service.TesseractOcrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class OcrController {

    @Autowired
    private TesseractOcrService tesseractOCRService;

    @PostMapping("/ocr")
    public Receipt recognizeText(@RequestParam("file") MultipartFile file) throws IOException {
        return tesseractOCRService.recognizeText(file.getInputStream());
    }
}