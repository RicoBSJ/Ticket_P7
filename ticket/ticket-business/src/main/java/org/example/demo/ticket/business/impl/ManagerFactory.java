package org.example.demo.ticket.business.impl;

import org.example.demo.ticket.business.contract.manager.ProjetManager;
import org.example.demo.ticket.business.contract.manager.TicketManager;

public class ManagerFactory {

    private ProjetManager projetManager;
    public ProjetManager getProjetManager(){
        return this.projetManager;
    }

    public void setProjetManager(ProjetManager pProjetManager) {
        projetManager = pProjetManager;
    }

    private TicketManager ticketManager;
    public TicketManager getTicketManager(){
        return this.ticketManager;
    }

    public void setTicketManager(TicketManager pTicketManager) {
        ticketManager = pTicketManager;
    }
}
