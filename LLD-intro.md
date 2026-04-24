# Introduction to Low-Level Design (LLD)

## Getting Started

This course is based on Java, as it is widely used in major codebases, but the principles of Low-Level Design apply to any programming language. The only prerequisite is a strong understanding of Object-Oriented Programming (OOP) concepts.

## What is Low-Level Design?

Low-Level Design (LLD) is the stage where your code begins to take shape. It is a detailed design phase that focuses on the internal structure and behavior of individual modules or components.

### Key points:
- LLD specifies classes, methods, variables, and data structures.
- It focuses on implementation details, algorithms, and logic flow.
- It bridges the gap between high-level architecture and actual coding.

## Real-Life Analogy

Think of building a house:
- High-Level Design (HLD) is like the architect’s blueprint — it shows room placement, sizes, and connections.
- Low-Level Design (LLD) is like choosing where switches go, how plumbing is routed, and what materials to use.

LLD is the detailed planning done before writing code.

## Example in Software

A basic login system illustrates LLD:
- Defining components like `login()`, `signUp()`, and `forgotPassword()`
- Describing how each function works
- Planning data structures and validation logic

## Key Characteristics of LLD

### Granular and Code-Level
- Dives into fine details of component behavior.
- Defines classes, functions, and data structures.
- Example: Instead of saying “need user authentication,” it describes which classes manage authentication, methods for validation, and failure handling.

### Implementation-Focused
- Directly linked to how code will be written.
- Guides logic, flow, and module structure.
- Often includes pseudocode and diagrams that show data flow.

### Uses OOP Principles
- Applies abstraction, encapsulation, inheritance, and polymorphism.
- Helps create modular, reusable, and maintainable systems.
- Example: A base `Notification` class with subclasses such as `EmailNotification` and `SMSNotification`.

## Stakeholders

In LLD, the primary audience is the implementation team:
- Senior Software Developers
- Technical Leads
- Managers involved in detailed design decisions

## HLD vs LLD

| Aspect | High-Level Design (HLD) | Low-Level Design (LLD) |
|---|---|---|
| Purpose | System overview and modules | Detailed implementation and logic |
| Level of Detail | Abstract | Highly detailed |
| Focus | Architecture, modules, interfaces | Class diagrams, methods, internal details |
| Outcome | Module and system diagrams | Detailed class and method diagrams |

## Why LLD Matters

### Benefits:
- Avoids rework by catching design issues early.
- Improves collaboration through a shared detailed design.
- Promotes scalability via modular design.
- Encourages clean code and use of design patterns.

LLD is essential for building maintainable and robust software systems.
