package com.robtsai.state;

import com.robtsai.state.BrushTool;
import com.robtsai.state.Canvas;
import com.robtsai.state.SelectionTool;

public class StateRunner {

    public static void runState() {
        var canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
