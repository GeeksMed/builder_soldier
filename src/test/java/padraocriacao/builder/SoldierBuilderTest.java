package padraocriacao.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SoldierBuilderTest{

    @Test
    void deveRetornarExcecaoParaSoldierSemMatricula() {
        try {
            SoldierBuilder soldierBuilder = new SoldierBuilder();
            Soldier soldier = soldierBuilder
                    .setNome("Soldier 1")
                    .setEmail("soldier1@email.com")
                    .setCpf("99999999999")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Matrícula inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaSoldierSemNome() {
        try {
            SoldierBuilder soldierBuilder = new SoldierBuilder();
            Soldier soldier = soldierBuilder
                    .setMatricula(1)
                    .setEmail("soldier1@email.com")
                    .setCpf("99999999999")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaSoldierSemCPF() {
        try {
            SoldierBuilder soldierBuilder = new SoldierBuilder();
            Soldier soldier = soldierBuilder
                    .setNome("Soldier 1")
                    .setMatricula(1)
                    .setEmail("soldier1@email.com")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("CPF inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarSoldierValido() {
        SoldierBuilder soldierBuilder = new SoldierBuilder();
        Soldier soldier = soldierBuilder
                .setMatricula(1)
                .setNome("Soldier 1")
                .setEmail("soldier1@email.com")
                .setCpf("99999999999")
                .build();

        assertNotNull(soldier);
    }
}
