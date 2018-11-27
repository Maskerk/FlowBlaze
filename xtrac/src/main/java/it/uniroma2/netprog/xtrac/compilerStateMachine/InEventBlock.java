package it.uniroma2.netprog.xtrac.compilerStateMachine;

import it.uniroma2.netprog.xtrac.compiler.utils.TableRowFactory;
import it.uniroma2.netprog.xtrac.model.action.Action;
import it.uniroma2.netprog.xtrac.model.event.Event;
import it.uniroma2.netprog.xtrac.model.state.State;

import java.util.Vector;

class InEventBlock extends CompilerState {
    @Override
    public void notifyGoInsideBlockBeforeStateTransition(State state, boolean isInitial, Event event, String stageName, String macroActionName) {

    }

    @Override
    public void notifyGoInsideBlockAfterStateTransition(State state, boolean isInitial, Event event, String stageName, String macroActionName) {
        TableRowFactory.getInstance().addEvent(event);
    }

    @Override
    public void notifyGoOutsideBlockBeforeStateTransition(State state, boolean isInitial, Event event, String stageName, String macroActionName) {

    }

    @Override
    public void notifyGoOutsideBlockAfterStateTransition(State state, boolean isInitial, Event event, String stageName, String macroActionName) {

    }

    @Override
    public void notifyGoInsideActionsBlockBeforeStateTransition(State state, boolean isInitial, Event event, String stageName, String macroActionName) {

    }

    @Override
    public void notifyGoInsideActionsBlockAfterStateTransition(State state, boolean isInitial, Event event, String stageName, String macroActionName) {

    }

     @Override
    public void addAction(Action action, State currentState, Event currentEvent) {
        TableRowFactory.getInstance().addActionToBlock(action, currentEvent);
    }

    @Override
    public void addActions(Vector<Action> actions) {

    }
}
