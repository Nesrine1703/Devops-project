package tn.esprit.rh.achat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import tn.esprit.rh.achat.entities.Fournisseur;
import tn.esprit.rh.achat.repositories.FournisseurRepository;
import tn.esprit.rh.achat.services.FournisseurServiceImpl;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class FournisseurServiceImplTest {
    @Mock
    private FournisseurRepository fournisseurRepository;

    @InjectMocks
    private FournisseurServiceImpl fournisseurService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testRetrieveAllFournisseurs() {
        // Given
        Fournisseur fournisseur1 = new Fournisseur();
        Fournisseur fournisseur2 = new Fournisseur();
        List<Fournisseur> fournisseurs = Arrays.asList(fournisseur1, fournisseur2);

        when(fournisseurRepository.findAll()).thenReturn(fournisseurs);

        // When
        List<Fournisseur> result = fournisseurService.retrieveAllFournisseurs();

        // Then
        assertEquals(fournisseurs.size(), result.size());
    }

    @Test
    void addFournisseur() {
    }

    @Test
    void updateFournisseur() {
    }

    @Test
    void deleteFournisseur() {
    }

    @Test
    void retrieveFournisseur() {
    }

    @Test
    void assignSecteurActiviteToFournisseur() {
    }
}