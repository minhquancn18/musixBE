package com.example.musixBE.payloads.requests.social;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ModifyCommentRequest {
    private String commentId;
    private String newContent;
}
