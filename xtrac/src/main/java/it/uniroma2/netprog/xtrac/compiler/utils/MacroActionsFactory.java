package it.uniroma2.netprog.xtrac.compiler.utils;

import it.uniroma2.netprog.xtrac.exception.AlreadyDefinedException;
import it.uniroma2.netprog.xtrac.exception.UndefinedMacroActionException;
import it.uniroma2.netprog.xtrac.model.action.Action;
import java.util.HashMap;
import java.util.Vector;

public class MacroActionsFactory {
    private static MacroActionsFactory ourInstance = new MacroActionsFactory();

    private HashMap<String, Vector<Action>> macroActions;
    private Vector<Action> actions;

    public static MacroActionsFactory getInstance() {
        return ourInstance;
    }

    private MacroActionsFactory() {
        macroActions = new HashMap<>();
    }

    public static void resetInstance() {
        ourInstance = new MacroActionsFactory();
    }

    public void createEmptyMacroAction(String name) throws AlreadyDefinedException {
        if(macroActions.containsKey(name))
            throw new AlreadyDefinedException("The macro action "+ name + "was already defined");
        macroActions.put(name, new Vector<>());
    }

    public Vector<Action> getMacroAction(String name) throws UndefinedMacroActionException {
        if(!macroActions.containsKey(name))
            throw new UndefinedMacroActionException("Undeclared macro action '"+name+"'");
        return macroActions.get(name);
    }
}
