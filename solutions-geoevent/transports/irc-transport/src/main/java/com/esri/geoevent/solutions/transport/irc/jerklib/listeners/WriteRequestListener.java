
package com.esri.geoevent.solutions.transport.irc.jerklib.listeners;

import com.esri.geoevent.solutions.transport.irc.jerklib.WriteRequest;


/**
 * WriteRequestListener - Listener to be notified of all writes
 *
 * @author mohadib
 */
public interface WriteRequestListener
{

    /**
     * receiveEvent() - method will be called anytime a write is requestd.
     *
     * @param request <code>WriteRequest</code> the write request
     */
    public void receiveEvent(WriteRequest request);

}
