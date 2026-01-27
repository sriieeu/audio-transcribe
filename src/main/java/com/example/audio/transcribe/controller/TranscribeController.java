package com.example.audio.transcribe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/transcribe")
public class TranscribeController {

    @GetMapping("/health")
    public String health() {
        return "Audio Transcribe Service is running";
    }

    @PostMapping("/upload")
    public String uploadAudio(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return "Please upload an audio file";
        }
        
        // TODO: Implement audio transcription logic using Spring AI
        return "Audio file received: " + file.getOriginalFilename();
    }

    @GetMapping("/status")
    public String getStatus() {
        return "Status: Ready to transcribe audio files";
    }
}
