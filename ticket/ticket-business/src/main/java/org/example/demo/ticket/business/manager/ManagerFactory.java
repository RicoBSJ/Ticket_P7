package org.example.demo.ticket.business.manager;

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
