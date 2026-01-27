package com.example.audio.transcribe.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class AudioTranscriptionService {

    /**
     * Transcribe an audio file using Spring AI
     * 
     * @param audioFile the audio file to transcribe
     * @return the transcription text
     */
    public String transcribeAudio(MultipartFile audioFile) {
        // TODO: Implement using Spring AI OpenAI integration
        // Example:
        // ChatClient chatClient = ChatClient.create(chatModel);
        // String transcription = chatClient.prompt()
        //     .user("Transcribe the following audio: " + audioFile.getOriginalFilename())
        //     .call()
        //     .content();
        // return transcription;
        
        return "Transcription not yet implemented";
    }

    /**
     * Validate audio file format
     * 
     * @param file the file to validate
     * @return true if valid audio file, false otherwise
     */
    public boolean isValidAudioFormat(MultipartFile file) {
        String contentType = file.getContentType();
        return contentType != null && (
            contentType.startsWith("audio/") ||
            contentType.equals("application/octet-stream")
        );
    }
}
