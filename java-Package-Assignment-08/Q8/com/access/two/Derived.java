package com.access.two;

import com.access.one.Base;

/**
 * Q8 – Access Modifier Control across packages
 *
 * Access Modifier Summary Table:
 * ┌─────────────────┬─────────────────┬─────────────┬──────────────────┬─────────────────┐
 * │  Modifier       │  Same Class     │ Same Package│  Subclass        │  Other Package  │
 * │                 │                 │             │  (diff. package) │                 │
 * ├─────────────────┼─────────────────┼─────────────┼──────────────────┼─────────────────┤
 * │  public         │      ✓          │     ✓       │       ✓          │       ✓         │
 * │  protected      │      ✓          │     ✓       │       ✓          │       ✗         │
 * │  default        │      ✓          │     ✓       │       ✗          │       ✗         │
 * │  private        │      ✓          │     ✗       │       ✗          │       ✗         │
 * └─────────────────┴─────────────────┴─────────────┴──────────────────┴─────────────────┘
 */
public class Derived extends Base {

    public void demonstrateAccess() {
        System.out.println("=== Access from Subclass in Different Package ===\n");

        // ✓ public – accessible
        System.out.println("public    : " + publicMethod());

        // ✓ protected – accessible in subclass even across packages
        System.out.println("protected : " + protectedMethod());

        // ✗ default – NOT accessible across packages (uncommenting causes compile error)
        // System.out.println(defaultMethod());

        // ✗ private – NOT accessible outside the class (uncommenting causes compile error)
        // System.out.println(privateMethod());

        // ✓ public wrapper that internally calls the private method
        System.out.println("(via public wrapper calling private): " + callPrivateMethod());

        System.out.println("\n--- Summary ---");
        System.out.println("'default' method  → NOT accessible (different package)");
        System.out.println("'private' method  → NOT accessible (outside class)");
    }
}
