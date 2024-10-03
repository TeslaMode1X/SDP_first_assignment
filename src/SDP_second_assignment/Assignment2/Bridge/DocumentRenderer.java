package SDP_first_assignment.src.SDP_second_assignment.Assignment2.Bridge;

import Assignment2.Bridge.RenderEngine;

// Класс для связи документа с движком рендеринга
public abstract class DocumentRenderer {
    protected RenderEngine engine;

    public DocumentRenderer(RenderEngine engine) {
        this.engine = engine;
    }

    public abstract void render(String content);
}

