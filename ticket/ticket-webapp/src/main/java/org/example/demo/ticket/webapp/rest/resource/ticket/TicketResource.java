package org.example.demo.ticket.webapp.rest.resource.ticket;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.example.demo.ticket.business.manager.TicketManager;
import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;
import org.example.demo.ticket.webapp.rest.resource.AbstractResource;

@Path("/tickets")
@Produces(MediaType.APPLICATION_JSON)
public class TicketResource extends AbstractResource {


    @GET
    @Path("{numero}")
    public Ticket get(@PathParam("numero") Long pNumero) throws NotFoundException {
        TicketManager vTicketManager = getManagerFactory().getTicketManager();
        Ticket vTicket = vTicketManager.getTicket(pNumero);
        return vTicket;
    }

    @GET
    @Path("search")
    public List<Ticket> search(@QueryParam("projetId") Integer pProjetId) {
        TicketManager vTicketManager = getManagerFactory().getTicketManager();
        List<Ticket> vList = vTicketManager.getListTicket(new RechercheTicket()
                                                              .setProjetId(pProjetId));
        return vList;
    }
}
