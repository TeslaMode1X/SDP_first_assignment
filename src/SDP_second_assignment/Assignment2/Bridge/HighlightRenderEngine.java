package SDP_first_assignment.src.SDP_second_assignment.Assignment2.Bridge;

import Assignment2.Bridge.RenderEngine;

// Реализация рендеринга документа с выделением текста
public class HighlightRenderEngine implements RenderEngine {
    @Override
    public void render(String content) {

        System.out.println("Rendering document with highlighted text: " + content);
    }
}

