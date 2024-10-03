package SDP_first_assignment.src.SDP_second_assignment.Assignment2.Bridge;

import Assignment2.Bridge.RenderEngine;

// Реализация простого рендеринга документа
public class SimpleRenderEngine implements RenderEngine {
    @Override
    public void render(String content) {
        System.out.println("Rendering document in simple mode: " + content);
    }
}

