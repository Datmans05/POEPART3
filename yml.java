/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestJava;

/**
 *
 * @author RC_Student_lab
 */
name: Java CI

on:
  push:
    branches:
      - main
  pull_request:
    branches:
      - main

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
    # Step 1: Check out the code
    - name: Checkout code
      uses: actions/checkout@v3

    # Step 2: Set up Java
    - name: Set up JDK 17
      uses: actions/setup-java@v3
      with:
        java-version: '17'

    # Step 3: Build and run tests
    - name: Build and run tests
      run: |
        ./gradlew test
