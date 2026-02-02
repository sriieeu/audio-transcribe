package com.example.audio.transcribe;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ai.openai.OpenAiAudioTranscriptionModel;
import org.springframework.ai.openai.api.OpenAiAudioApi;

@RestController
@RequestMapping("/api/transcribe")
public class TranscriptionController {

    private final OpenAiAudioTranscriptionModel transcriptionModel;

    public TranscriptionController(@Value("${spring.ai.openai.api-key}") String apiKey) {
        OpenAiAudioApi openAiAudioApi = new OpenAiAudioApi(apiKey);
        this.transcriptionModel = new OpenAiAudioTranscriptionModel(openAiAudioApi);
    }

}


