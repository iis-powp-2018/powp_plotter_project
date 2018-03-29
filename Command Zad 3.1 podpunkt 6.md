# Command Zad 3.1
## Podpunkt 6

### Dependency injection
Przykładem wstrzykiwania zależności jest zastosowanie interfejsu IPlotter. W każdym miejscu w kodzie, gdzie używany jest obiekt takiego typu możemy wstawić jego dowolną implementację (np. rzeczywisty ploter lub symulator plotera, który narysuje obraz na ekranie monitora)

### Metoda wytwórcza
Zastosowana przy produkcji linii.
``` Java
ILine line = LineFactory.getBasicLine();
```
Jak widać w powyższym kodzie zastosowanie ma także wzorzec Dependency injection

### Obserwator
Wzorzec obserwator ma w programie zastosowanie np. podczas wybierania testów użytkownika z górnego menu. Po wybraniu pozycji wywoływana jest metoda `void actionPerformed(ActionEvent e)` obiektu implementującego interfejs `ActionListener`. Takie listenery dodawane są w pliku `TestPlotSoftPatterns` w metodzie `void setupPresetTests(Context context)`

np.
``` Java
context.addTest("Figure Joe 1", new SelectFirstTestFigureOptionListener());
context.addTest("Figure Joe 2", new SelectSecondTestFigureOptionListener());
```

