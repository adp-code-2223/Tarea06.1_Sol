package modelo.events;

import java.util.EventListener;

// Define la interfaz para el nuevo tipo de evento
public interface BDModificadaListener extends EventListener {
	public void capturarBDModificada(BDModificadaEvent ev);
}
