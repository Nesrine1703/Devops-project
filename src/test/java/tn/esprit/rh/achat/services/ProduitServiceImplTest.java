package tn.esprit.rh.achat.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import tn.esprit.rh.achat.entities.Produit;
import tn.esprit.rh.achat.repositories.ProduitRepository;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.*;

class ProduitServiceImplTest {

    @Mock
    private ProduitRepository produitRepository;
    @InjectMocks
    private ProduitServiceImpl produitService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void addProduit() {
        Produit produit = new Produit();
        when(produitRepository.save(any())).thenReturn(produit);
        assertEquals(produitService.addProduit(produit), produit);
    }

    @Test
    void retrieveProduit() {
        Produit produit = new Produit();
        when(produitRepository.findById(any())).thenReturn(Optional.of(produit));
        assertEquals(produitService.retrieveProduit(produit.getIdProduit()), produit);
    }

}