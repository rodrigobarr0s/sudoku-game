package br.com.sudoku.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static br.com.sudoku.services.EventEnum.CLEAR_SPACE;

public class NotifierService {

	private final Map<EventEnum, List<EventListener>> listeners = new HashMap<>() {
		private static final long serialVersionUID = 1L;

	{
        put(CLEAR_SPACE, new ArrayList<>());
    }};

    public void subscribe(final EventEnum eventType, EventListener listener){
        var selectedListeners = listeners.get(eventType);
        selectedListeners.add(listener);
    }

    public void notify(final EventEnum eventType){
        listeners.get(eventType).forEach(l -> l.update(eventType));
    }

}