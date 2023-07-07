package com.robtsai.state;


public class Canvas {
    private ToolType currentTool;

    public void mouseDown() {

    }

    public void mouseUp() {

    }

    public ToolType getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(ToolType currentTool) {
        this.currentTool = currentTool;
    }
}
