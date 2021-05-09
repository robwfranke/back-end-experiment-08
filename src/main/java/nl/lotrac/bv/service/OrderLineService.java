package nl.lotrac.bv.service;

import nl.lotrac.bv.model.OrderLine;

import java.util.Collection;

public interface OrderLineService {

    public abstract Collection<OrderLine>getLines();

}
