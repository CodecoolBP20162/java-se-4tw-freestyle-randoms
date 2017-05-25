package com.codecool.cinema;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class CinemaTest {

    Cinema cinema = mock(Cinema.class);
    ArrayList<StudentWorker> studentWorkers = new ArrayList<>();
    ArrayList<Leader> leaders = new ArrayList<>();


    // Mocking StudentWorkers
    @Test
    void hireStudentWorkers() {
        Mockito.when(cinema.hireStudentWorkers(1)).thenReturn(studentWorkers);
        assertEquals(studentWorkers, cinema.hireStudentWorkers(1));
    }
    // Mocking Leaders
    @Test
    void hireManagers() {
        Mockito.when(cinema.hireManagers(2)).thenReturn(leaders);
        assertEquals(leaders, cinema.hireManagers(2));
    }
    // Mocking One Lead Manager
    @Test
    void hireOneManager() {
        Mockito.when(cinema.hireOneManager(3)).thenReturn(leaders);
        assertEquals(leaders, cinema.hireOneManager(3));
    }

    @Test
    void oneLeader() {
        Mockito.when(cinema.oneLeader(4)).thenReturn(leaders);
        assertEquals(leaders, cinema.oneLeader(4));

    }



}
