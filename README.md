# Queue Management System

JavaFX queue-simulation coursework exploring scheduling strategies and concurrent queue structures.

## Overview

A desktop simulation project organized around tasks, servers, a scheduler, and interchangeable queue-selection strategies.

## Source map

- `BusinessLogic/`: scheduler, shortest-queue strategy, and time-based strategy.
- `Model/`: task and server state, including blocking queues and atomic counters.
- `GUI/`: JavaFX simulation controls and presentation.

Source files are under `QueueManagementSystem/src/main/`.

## Setup and status

Clone the repository and import the nested `QueueManagementSystem/` directory as a Maven project. The checked-in compiler configuration targets JDK 23. Inspect the JavaFX entry point and module settings before launching; a working build/run has not been verified.

The current `Model/Server.java` contains an unfinished empty `run()` loop. This version should be treated as coursework in progress rather than a complete concurrent simulation.

## Engineering focus

This project explores scheduling decisions and shared queue state. Follow-up work should implement worker processing/shutdown, check waiting-time accounting, and test the strategies with deterministic scenarios before comparing simulation results.
