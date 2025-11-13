// Se importan las bibliotecas necesarias para obtener datos de entrada del 
// usuario y presentar datos de salida.
import java.io.*;

public class App {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

    public static void main(String[] args) throws Exception {
        // ------------------------------------------------------
        // ------------- Definicion de Variables ----------------
        // ------------------------------------------------------

        int ubicacionJugador = 0;   // creeo las variables necesarias y les asigno valores a las variables
        String nombrePersonaje = "";
        char accionInventario = ' ';
        String mapaIsla = " ";
        boolean seguirJugado = true;
        boolean adivinanzaseleccionada1;
        int adivinanzaCompletada = 0;
        String nombrePersonaje1 = "";
        boolean combateJefeFinal1;
        String[] arregloInventario = new String[3];
        //Invoco la funcion openin para dar los mensajes inicales, avisos y obtener el numero del user
        nombrePersonaje = opening(nombrePersonaje1);  
        //Ciclo donde el usuario puede moverse alrededor del mapa y con una guia del mapa cada vez que empieza de nuevo el ciclo
        while (seguirJugado) {  
            System.out.println("   ");
            System.out.println("                   MAPA ");  
            System.out.println(" ---------------------------------------");
            System.out.println("|               SKYPEA                  |");
            System.out.println("|    1. Playa                           |");
            System.out.println("|                                       |");
            System.out.println("|                     2. Cueva          |");
            System.out.println("|                                       |");
            System.out.println("|	     3. Jungla		                  |");
            System.out.println("|                                       |");
            System.out.println("|             4.Montaña                 |");
            System.out.println("|                                       |");
            System.out.println("|                         5. Ruinas     |");
            System.out.println(" ---------------------------------------");
            //Identificar donde se quiere mover el usuario
            System.out.println(" Inserte el numero de la Isla a donde le gustaria ir " + nombrePersonaje );
            ubicacionJugador = Integer.parseInt(in.readLine()); // Leo la ubicacion del mapa
            //Limpio el buffer para evitar errores de algun espacio o letra
            System.out.println("    ");    
            if(ubicacionJugador > 0 && ubicacionJugador < 6){  //condicion en caso digite un numero que no es parte del mapa
                switch(ubicacionJugador){ 
                //Creo una descipcion para cada lugar del mapa para darle una mejor referencia al usuario
                case 1:
                mapaIsla = "Playa";
                System.out.println(" ---------------------------------------------------------------- "); 
                System.out.println("\\  Bienvenido, " + nombrePersonaje + " a la " + mapaIsla + " de Skypea /");
                System.out.println("\\    -    -    -    -    -    -    -                                ");
                System.out.println("\\ ¡Arena, sol y mar! Nada más genial como un día en la playa...   /");
                System.out.println("\\ pero esta no es una playa cualquiera, es la playa de la Isla    /");
                System.out.println("\\ más misteriosa y tienes aquí una misión.                        /");
                System.out.println("\\ Este lugar mágico es de arena blanca y agua cristalina,         /");
                System.out.println("\\ donde podemos ver animales y peces a través del agua...         /");
                System.out.println("\\ Un clima espléndido.                                            /");
                System.out.println(" ----------------------------------------------------------------   ");
                //Imprimir una descripcion de un tesoro y preguntar si desea investigar
                System.out.println("Allá a lo lejos hay un cofre con posibles cosas que te ayudarían en el camino");
                System.out.print("¿Te gustaría ir a investigar? (s/n): "); 
                accionInventario =   (char) System.in.read();  //Leo su respuesta
                System.in.read();
                //Creo una condicon en la eleccion del ususario por si ve o no en el cofre
                    if(accionInventario ==  's'){  
                        //Imprimo un listado de lo que econtro
                        System.out.println("¡Recuerde! En su inventario tiene espacio para 3 elementos.");
                        System.out.println("----");
                        System.out.println("En este cofre hay varios elementos:");
                        System.out.println("1. Vendas");
                        System.out.println("2. Pico");
                        System.out.println("3. Mapa antiguo");
                        Inventario(arregloInventario);
                    }
                    else{  // Imprimo que continue
                        System.out.println("Puede  seguir explorando");
                        
                    }

                break;
                //Creo una descipcion para cada lugar del mapa para darle una mejor referencia al usuario
                case 2:
                mapaIsla = "Cueva";
                System.out.println("    ");
                System.out.println(" ----------------------------------------------------------------      ");
                System.out.println("\\  Bienvenido, " + nombrePersonaje + " a la " + mapaIsla + " de Skypea /");
                System.out.println("\\    -    -    -    -    -    -    -                                 /");
                System.out.println("\\ ¡Oscuro, oscuro y olor misterioso! Esta cueva da miedo...          /");
                System.out.println("\\ En esta cueva se ocultan secretos, nadie que haya entrado ha       /");
                System.out.println("\\ salido para contarlo.                                              /");
                System.out.println("\\ Esta cueva dicen que es mágica pero tenebrosa, oscura pero te      /");
                System.out.println("\\ ilumina la cabeza. Para saber hay que entrar y averiguarlo.        /");
                System.out.println(" ---------------------------------------------------------------- ");
                System.out.println("    ");
                //Imprimir una descripcion de un tesoro y preguntar si desea investigar
                System.out.println("Detrás de esta roca veo un saco con posibles cosas que te ayudarían en el camino.");
                System.out.print("¿Te gustaría ir a investigar? (s/n): ");
                System.out.println("    ");
                accionInventario =   (char) System.in.read();//Leo su respuesta
                System.in.read();
                //Creo una condicon en la eleccion del ususario por si ve o no en el cofre
                    if(accionInventario ==  's'){
                        System.out.println("¡Recuerde! En su inventario tiene espacio para 3 elementos.");
                        System.out.println(" ");
                        System.out.println("Detrás de la roca hay varios elementos:");
                        System.out.println("      ");
                        System.out.println("1. Antorcha");
                        System.out.println("2. Una lanza");
                        System.out.println("3. Roca de colores");
                        Inventario(arregloInventario);

                    }
                    else{
                        System.out.println("Puede seguir exploradno");
                    }
                break;
                //Creo una descipcion para cada lugar del mapa para darle una mejor referencia al usuario
                case 3: 
                mapaIsla = "Jungla";
                System.out.println(" ----------------------------------------------------------------      ");
                System.out.println("\\  Bienvenido, " + nombrePersonaje + " a la " + mapaIsla + " de Skypea /");
                System.out.println("\\    -    -    -    -    -    -    -                                 /");
                System.out.println("\\ La jungla se extiende con su espeso follaje y sonidos extraños.    /");
                System.out.println("\\ El aroma a tierra húmeda y flores salvajes llena el ambiente.      /");
                System.out.println("\\ Criaturas ocultas vigilan entre las sombras de los árboles.        /");
                System.out.println("\\ Cada paso sobre la hierba cruje como si la selva respirara.        /");
                System.out.println("\\ Un antiguo sendero cubierto de musgo invita a ser explorado.       /");
                System.out.println(" ----------------------------------------------------------------      ");
                System.out.println("    ");
                //Imprimir una descripcion de un tesoro y preguntar si desea investigar
                System.out.println("Dentro de una caja de madera escondida en el hueco de un árbol,");
                System.out.println("cubierta de telarañas, hay posibles cosas que te pueden ayudar en el camino.");
                System.out.println("    ");
                System.out.print("¿Te gustaría ir a investigar? (s/n): ");
                System.out.println("    ");
                accionInventario =   (char) System.in.read();//Leo su respuesta
                System.in.read();
                //Creo una condicon en la eleccion del ususario por si ve o no en el cofre
                    if(accionInventario ==  's'){
                        System.out.println("¡Recuerde! En su inventario tiene espacio para 3 elementos.");
                        System.out.println("");
                        System.out.println("Dentro de la caja hay varios elementos:");
                        System.out.println("1. Machete oxidado");
                        System.out.println("2. Cantimplora de metal");
                        System.out.println("3. Brújula antigua");
                        Inventario(arregloInventario);

                        }
                        else{
                            System.out.println("Puede seguir exploradno");
                        }
                break;
                //Creo una descipcion para cada lugar del mapa para darle una mejor referencia al usuario
                case 4:
                mapaIsla = "Montana";
                System.out.println(" ----------------------------------------------------------------      ");
                System.out.println("\\  Bienvenido, " + nombrePersonaje + " a la " + mapaIsla + " de Skypea /");
                System.out.println("\\    -    -    -    -    -    -    -                                 /");
                System.out.println("\\ El viento helado golpea con fuerza en la cima de la montaña.       /");
                System.out.println("\\ Las nubes se arremolinan alrededor, ocultando el sendero.          /");
                System.out.println("\\ A lo lejos, un águila sobrevuela los acantilados rocosos.          /");
                System.out.println("\\ El suelo es resbaladizo, y cada paso debe darse con cuidado.       /");
                System.out.println("\\ La altura revela un paisaje imponente, pero también peligroso.      ");
                System.out.println(" ----------------------------------------------------------------      ");
                System.out.println("    ");
                //Imprimir una descripcion de un tesoro y preguntar si desea investigar
                System.out.println("Entre unas rocas apiladas, parece haber un viejo baúl");
                System.out.println("con posibles cosas que te pueden ayudar en el camino.");
                System.out.println("    ");
                System.out.print("¿Te gustaría ir a investigar? (s/n): ");
                System.out.println("    ");
                accionInventario =  (char) System.in.read();//Leo su respuesta
                //Creo una condicon en la eleccion del ususario por si ve o no en el cofre
                    if(accionInventario ==  's'){
                        System.out.println("¡Recuerde! En su inventario tiene espacio para 3 elementos.");
                        System.out.println("    ");
                        System.out.println("Dentro del baúl hay varios elementos:");
                        System.out.println("1. Cuerda resistente");
                        System.out.println("2. Crampones para escalar");
                        System.out.println("3. Pedernal para encender fuego");
                        System.out.println("    ");
                        System.in.read();
                        Inventario(arregloInventario);
                    }else{
                        System.out.println("Puede seguir exploradno");
                    }
                break;
                //Creo una descipcion para cada lugar del mapa para darle una mejor referencia al usuario
                case 5:
                mapaIsla = "Ruinas";
                System.out.println(" ----------------------------------------------------------------     ");
                System.out.println("\\  Bienvenido, " + nombrePersonaje + " a la " + mapaIsla + " de Skypea  /");
                System.out.println("\\    -    -    -    -    -    -    -                                /");
                System.out.println("\\ Piedras cubiertas de musgo revelan restos de una civilización.    /");
                System.out.println("\\ Inscripciones antiguas decoran los muros derrumbados.             /");
                System.out.println("\\ Se escucha el eco del viento silbando entre las estructuras.      /");
                System.out.println("\\ El aire está cargado con el misterio de lo desconocido.           /");
                System.out.println("\\ Un pasadizo oculto parece conducir a algo más profundo...         /");
                System.out.println(" ----------------------------------------------------------------    " );
                System.out.println("    ");
                //Imprimir una descripcion de un tesoro y preguntar si desea investigar
                System.out.println("Bajo un altar de piedra, hay un cofre cubierto de polvo");
                System.out.println("con posibles cosas que te pueden ayudar en el camino.");
                System.out.println("    ");
                System.out.print("¿Te gustaría ir a investigar? (s/n): ");
                System.out.println("    ");
                accionInventario =   (char) System.in.read();//Leo su respuesta
                System.in.read();
                //Creo una condicon en la eleccion del ususario por si ve o no en el cofre
                    if(accionInventario ==  's'){
                        System.out.println("¡Recuerde! En su inventario tiene espacio para 3 elementos.");
                        System.out.println("    ");
                        System.out.println("Dentro del cofre hay varios elementos:");
                        System.out.println("1. Daga ceremonial");
                        System.out.println("2. Pergamino con inscripciones extrañas");
                        System.out.println("3. Linterna de aceite");
                        System.out.println("    ");
                        Inventario(arregloInventario);
                    }else{
                        System.out.println("    ");
                        System.out.println("Puede seguir exploradno");
                    }
                    break;
                default: // un caso determinado en caso de algun error le de al user un mensaje de error
                    mapaIsla = " ";
                    System.out.println("    ");
                    System.out.println("Opcion no valida. Fin del juego"); 
                } 
            }
            else { //Cierre de la primera condicion en caso de que ingrese mal el numero de la ubicacion de la Isla se imprima un mensaje de error
                System.out.println("Lugar no encontrado en el mapa... se perdió. Intentelo de nuevo");
            }
            //Imprimo aviso para continuar con las adivinanzas
            System.out.println("    "); 
            System.out.println(" PARA CONTINUAR deber resolver esta adivinanza, tendras 3 intentos para lograrlo....");
            System.out.println("    ");
            System.out.println("--------------------------------------------------"); 
            System.out.println("    "); 
            //Invoco la funcion Adivinanza Juego encargado del proceso de adivinanzas
            adivinanzaseleccionada1 = adivinanzaJuego();
            //Creo una condicion por si gana o completa las adivinanzas
            if (adivinanzaseleccionada1 == true ) { 
                adivinanzaCompletada ++; // si fue correcta, se le suma un punto para serguir sino no tiene el punto
                System.out.println("--------------------------------------------------"); 
                System.out.println("Llevas "+ adivinanzaCompletada + "/3"); //Imprimo el status de sus adivinazas ya completadas 
                System.out.println("    "); 
                System.out.println("--------------------------------------------------");
            }//Condicion por si el usuario gana y completa los 3 acertijos
            if (adivinanzaCompletada == 3) { 
                System.out.println("--------------------------------------------------"); 
                System.out.println("    ");
                //Imprimo un mensaje cuando gana el juego
                out.print("FELICIDADES"+ nombrePersonaje + " has gnado el juego!! "); 
                System.out.println("    ");
                System.out.println("--------------------------------------------------");
                System.out.println("    ");
                //Cambio el valor de la condicion del while a false para que termine el bucle
                seguirJugado = false; 
            } 
        }//Imprimo un mensaje para la siguiente fase final
        System.out.println("Crees que aqui ha terminado todo?");
        // Invocando a la pelea ultra final 
        //Invoco la funcion del proceeso final de la batalla con el Jefe
        combateJefeFinal1 = combateJefeFinal();
        //Creo una condicion para evaluar si el jugador Gana o pierde el juego
        if (combateJefeFinal1 == true) {
            //Imprimo mensaje de Ganador
            System.out.println("--------------------------------------------------");
            System.out.println("    ");
            System.out.println("YOU WON");
            System.out.println("    ");
            System.out.println("--------------------------------------------------");
        } else {
            //Imprimo mensaje de Perdedor
            System.out.println("--------------------------------------------------");
            System.out.println("    ");
            System.out.println("GAME OVER");
            System.out.println("    ");
            System.out.println("--------------------------------------------------");
        }
    }  
    // FUNCIONES
    //Funcion encargada de las Adivinazas
    static public boolean adivinanzaJuego() throws IOException{  
    //Definicion de Variables
    String adivinanza = ""; String respuestaCorrecta = ""; String pista = ""; int adivinanzaSeleccionada = 0;
    //Imprimir y leer textos en esta funcion
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
    String respuestaUsuario = "";  
    System.in.read(); // Limpia el buffer
    //Proceso para escoger aleatoreamente una Adivinanza
    adivinanzaSeleccionada = (int) (Math.random() * 10) + 1;
    //Proceso donde se escoge la Adivinanza, pista y respuesta correcta dependiendo del numero aleatorio
        switch (adivinanzaSeleccionada) {  
            case 1:
            System.out.println("--------------------------------------------------"); 
            System.out.println("    "); 
            adivinanza = "Cuando el sol brilla, me puedes ver, pero cuando me entierran, dejo de ser. Guardo secretos de marineros antiguos, y solo el valiente me puede poseer. ¿Qué soy?"; //guardo la adivinanza
            respuestaCorrecta = "cofre"; 
            pista = "Se oculta en la arena y guarda tesoros.";
            break;
            case 2:
            System.out.println("--------------------------------------------------"); 
            System.out.println("    "); 
            adivinanza = "No tengo alas, pero vuelo, desaparezco si hay aguacero. Soy guía en la oscuridad, pero con cuidado, puedo dañar. ¿Qué soy?";
            respuestaCorrecta = "antorcha";
            pista = "Brillo en la oscuridad y ayudo a ver.";
            break;
            case 3:
            System.out.println("--------------------------------------------------"); 
            System.out.println("    "); 
            adivinanza = "No soy fiera, pero abro camino, en mi filo hay fuerza y destino. Verde espesura corto sin miedo, para avanzar soy el mejor en el ruedo. ¿Qué soy?";
            respuestaCorrecta = "machete";
            pista = "Se usa para cortar ramas en la selva.";
            break;
            case 4:
            System.out.println("--------------------------------------------------"); 
            System.out.println("    "); 
            adivinanza = "Desde lo alto vigilo, entre nubes puedo estar. Los pájaros me visitan, y el viento me hace vibrar. ¿Qué soy?";
            respuestaCorrecta = "montana";
            pista = "Es el punto más alto de la isla.";
            break;
            case 5:
            System.out.println("--------------------------------------------------"); 
            System.out.println("    "); 
            adivinanza = "En mi cima hay secretos, el tiempo me ha erosionado. No soy joven ni viejo, pero siempre estoy parado. ¿Qué soy?";
            respuestaCorrecta = "ruinas";
            pista = "Son restos de una civilización antigua.";
            break;
            case 6:
            System.out.println("--------------------------------------------------"); 
            System.out.println("    "); 
            adivinanza = "Nací del fuego y el calor, a veces rujo con gran terror. Aunque parezca que duermo, puedo despertar y causar ardor. ¿Qué soy?";
            respuestaCorrecta = "volcan";
            pista = "Escupe lava y humo.";
            break;
            case 7:
            System.out.println("--------------------------------------------------"); 
            System.out.println("    "); 
            adivinanza = "De día canto sin hablar, de noche descanso sin soñar. Vivo entre hojas y colores, y en el aire me puedes hallar. ¿Qué soy?";
            respuestaCorrecta = "loro";
            pista = "Es un ave que repite sonidos.";
            break;

            case 8:
            System.out.println("--------------------------------------------------"); 
            System.out.println("    "); 
            adivinanza = "Siempre fluyo, nunca me detengo, me reflejo en el cielo y también en el suelo. A los peces les doy hogar, y al sediento de beber. ¿Qué soy?";
            respuestaCorrecta = "rio";
            pista = "El agua siempre corre en mí.";
            break;

            case 9:
            System.out.println("--------------------------------------------------"); 
            System.out.println("    "); 
            adivinanza = "De hueso estoy hecho, pero no tengo piel. Perdí mi carne hace mucho, pero mi historia aún puedes ver. ¿Qué soy?";
            respuestaCorrecta = "esqueleto";
            pista = "Se encuentra en cuevas o lugares antiguos.";
            break;

            case 10:
            System.out.println("--------------------------------------------------"); 
            System.out.println("    "); 
            adivinanza = "Soy alta y verde, en la playa me puedes ver. Doy sombra y alimento, y con cocos me puedes comer. ¿Qué soy?";
            respuestaCorrecta = "palmera";
            pista = "Es un árbol típico de la playa.";
            break;

            default:
            System.out.println("--------------------------------------------------"); // un caso determinado en caso de que pase un error o se ejecute mal un numero aleatorio
            System.out.println("    "); 
                System.out.println("Error: No se pudo seleccionar una adivinanza."); //Imprimo un mensaje de error 
        }
        //Definicion de variables intermedias para un subproceso
        boolean acertada = false ; 
        int intentos = 0; 
        // Imprimo mensaje de preparacion
        System.out.println("Llego el momento de la adivinanza, preparese!");
        System.out.println("    ");
        System.out.println("--------------------------------------------------");
        //Creo un bucle donde cuando acierte o llegue a su limite de intentos pierda el turno 
        while (!acertada && intentos < 4) { 
            //Imprimo la adivinanza
            out.println("Esta es tu adivinanza ---> " + adivinanza);
            System.out.println("    ");
            //Imprimo que Inserte la respuesta
            System.out.println("Su respuesta es -----> "); 
            //Leer respuesta
            respuestaUsuario = in.readLine(); 
            //Condicion para evaluar la respuesta y se cumpla una accion
                if (respuestaUsuario.equals(respuestaCorrecta)) { 
                    System.out.println("    "); 
                    System.out.println("--------------------------------------------------");
                    //Imprimo mensaje si la respuesta es correcta
                    out.println("Su respuesta es correcta, ha completado un arcertijo");  
                    System.out.println("    ");
                    acertada = true; // Termina el bucle

                } else {
                    System.out.println("    ");
                    System.out.println("--------------------------------------------------");
                    //Imprimo mensaje respuesta incorrecta
                    out.println("Su respuesta es incorrecta, intentelo de nuevo"); 
                    intentos++; //Aumeta su contador de intentos
                }
                //Creo una condicion cuando ha hecho 3 intentos
                if (intentos == 3) { 
                    System.out.println("    ");
                    System.out.println("--------------------------------------------------");
                    //Imprimo una pista de la adivinanza
                    out.println("Este es su tercer intento y se le brindara una pista: "+ pista);
                    System.out.println("    ");
                    System.out.println("--------------------------------------------------");
                }
        }
        return acertada; //Retorna si acerto o no acerto como boolean
    }
    //Funcion encargada de imprimir el opening del juego obteninedo el nombre del jugadot
    public static String opening (String nombrejugador1) throws IOException { 
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    //Defino la variable
    String nombrePersonaje1 = "";
    //Imprimir mensaje de bienvenida 
    System.out.println("|                                 |");
    System.out.println("| !Bienvenido a la isla de Skypea!|");
    System.out.println("|                                 |"); 
    System.out.println("    "); 
    //Imprimir que ingrese su nombre
    System.out.println(" Misterioso Jugador ingrese su nombre secreto : "); 
    //Leo el nombre del personaje 
    nombrePersonaje1 = in.readLine(); 
    //Imprimir reglas del juego como parte del opening
    System.out.println("    "); 
    System.out.println("***************************************************"); 
    System.out.println("    "); 
    System.out.println("                  REGLAS DEL JUEGO                   ");
    System.out.println("    "); 
    System.out.println("1. Para lograr salir de este juego debe completar 3 adivinanzas");
    System.out.println("    y SI NO lo hace quedaras atrapado infinitamente aqui"); 
    System.out.println("2. El juego le dara 3 oportunidades de acertar en cada adivinanza");
    System.out.println(" que se tope, si llega a la cuarta se le dara una pista pero si falla");
    System.out.println(" falla esta perdera esa adivinanza");
    System.out.println("    "); 
    System.out.println("***************************************************"); 
    System.out.println("    "); 
    System.out.println(" "); 
    System.out.println("    "); 
    System.out.println("Bienvenido "+ nombrePersonaje1 +" al juego, conoce el mapa"); 
    System.out.println("--------------------------------------------------"); 
    System.out.println("    ");
    //Retornar el nombre del personaje
    return nombrePersonaje1;  
    }
    //Funcion del proceso del combate final con el jefe
    static public boolean combateJefeFinal() throws IOException{
         // ------------------------------------------------------
        // ------------- Definicion de Variables ----------------
        // ------------------------------------------------------
        String cualquierLetra = "";
        int opcionMaldicion = 0;
        boolean ganoCombate = false;
        int vidaJugadorCombate = 3;
        int turnoUno = 0;
        int turnoDos = 0;
        boolean perdioCombate = false;
        //Crear un ciclo hasta que pierda o gane
        while (ganoCombate != true && perdioCombate != true) {
            //Imprimir mensaje Holograma del Dr. Nefario 
            System.out.println("Tras ganar todas las adivinanzas, aparece un reproductor holográfico antiguo");
            System.out.println("que cae del cielo y comienza a proyectar una imagen.");
            System.out.println();
            System.out.println("Dr. Nefario (holograma):");
            System.out.println("\"¡Por fin! Has sido el único en resolverlas todas. Llevo años investigando esta isla...");
            System.out.println("pero fui capturado por Sukuna, una maldición con forma humana que protege el tesoro de la Isla Skypea.");
            System.out.println("Solo tú puedes salvarme...\"");
            System.out.println();
            System.out.println();
            //Imprimir mensaje de toca caulquier letra para continuar, para darle el tiempo al user cuando este listo
            System.out.println("Presiona cualquier tecla para ser teletransportado a la cueva secreta de Sukuna.");
            cualquierLetra = in.readLine();
            //Imprimir la Entrada a la cueva para darle una descripcion al usuario
            System.out.println("Te despiertas dentro de una cueva oscura y gigantesca.");
            System.out.println("El suelo tiembla levemente. Lava fluye por las grietas de las paredes.");
            System.out.println("El aire es caliente y denso.");
            System.out.println();
            System.out.println("Encuentras un artefacto misterioso tirado en el suelo, parece estar hecho de piedra y cristal.");
            System.out.println("Lo tomas por instinto.");
            System.out.println();
            //Imprimir la interaccion de las Maldiciones Menores
            System.out.println("Narrador: Empiezas a escuchar pasos y susurros extraños.");
            System.out.println("De las sombras emergen varias maldiciones menores.");
            System.out.println("¡Te están rodeando!");
            System.out.println();
            //Primera Interaccion para saber que desea hacaer el usuario 
            System.out.println("DECISIÓN:");
            System.out.println("¿Qué deseas hacer?");
            System.out.println();
            System.out.println("1. Pelear:");
            System.out.println();
            System.out.println("2. Escapar:");
            System.out.println();
            //Leemos la decision del usuario
            opcionMaldicion = Integer.parseInt(in.readLine());
            //Acciones y consecuencias dependinedo de lo que escoge
            if (opcionMaldicion ==1) {
                System.out.println("-> Usas el artefacto misterioso. Una energía brillante emana de él y destruye a las maldiciones. Avanzas ileso."); 
            }else{
                System.out.println("-> Escapas corriendo, pero pisas una trampa y caes, quedando herido. Avanzas con dificultad.");
                //Disminue la vida por la desicion
                vidaJugadorCombate --;
                System.out.println();
                System.out.print("Se te gasto una de tus vidas");
                System.out.println();
            }
            //Encuentro con Sukuna (jefe final)
            System.out.println("Llegas a una cámara circular con un trono hecho de obsidiana.");
            System.out.println("Una figura te espera sentado, envuelto en una energía oscura.");
            System.out.println();
            System.out.println("Sukuna:");
            System.out.println("\"Así que tú eres el elegido... Vamos a ver cuánto vales.\"");
            System.out.println();
            // Comienza el combate con el primer turno
            System.out.println("COMIENZA EL COMBATE");
            System.out.println();
            System.out.println("............");
            System.out.println("Turno 1 -Primera decisión");
            System.out.println();
            System.out.println("¿Qué deseas hacer?");
            System.out.println("1. Atacar por sorpresa");
            System.out.println("2. Provocar a Sukuna");
            System.out.println("............");
            // Leemos la opcion que elige
            turnoUno = Integer.parseInt(in.readLine());
            System.out.println("________________________________________");
            System.out.println();
            //Acciones y consecuencias dependinedo de lo que escogio
            if (turnoUno ==1) {
                System.out.println("-> ¡Cuenta como un ataque! Le haces un corte leve a Sukuna."); 
            }else{
                System.out.println("-> No cuenta como ataque. Solo lo enfureces.");
                //Disminue la vida por la desicion
                vidaJugadorCombate --;
                System.out.println();
                System.out.print("Se te gasto una de tus vidas");
                System.out.println();
            }
            //Empieza el segundo turno
            System.out.println("............");
            System.out.println("Turno 2 - Segunda decisión");
            System.out.println();
            System.out.println("¿Qué deseas hacer?");
            System.out.println("1. Usar el artefacto misterioso");
            System.out.println("2. Fingir rendirte y atacar cuando se acerque");
            System.out.println("............");
            //Leemos que ataque elige
            turnoDos = Integer.parseInt(in.readLine());
            System.out.println("________________________________________");
            System.out.println();
            //Acciones y consecuencias dependinedo de lo que escogio
            if (turnoUno ==1) {
                System.out.println("-> ¡Cuenta como un ataque! El artefacto brilla con fuerza y lanza un rayo de energía."); 
            }else{
                System.out.println("-> ¡Cuenta como un ataque! Aprovechas que baja la guardia y le haces daño.");
                System.out.println("pero te devuelve un golpe en la cara, aun asi Sukuna queda un poco debil y atontado");
                //Disminue la vida por la desicion
                vidaJugadorCombate --;
                System.out.println();
                System.out.print("Se te gasto una de tus vidas");
                System.out.println();
            }
                //Se crea un switch donde depende de las opciones eleginas esta cada final de la batalla
                switch (vidaJugadorCombate) {
                    //Imprimir Final Tragico con cero vidas
                    case 0:
                        System.out.println("Fallaste en dañarlo. No tuviste la fuerza suficiente, pero no retrocediste.");
                        System.out.println("Sukuna te vence... pero subestima tu espíritu.");
                        System.out.println("Narrador: En tus últimos segundos, logras activar el artefacto con tu energía vital.");
                        System.out.println("No lo derrotas, pero lo sellas parcialmente.");
                        System.out.println("Tu cuerpo cae, pero tu alma se convierte en un faro de resistencia.");
                        System.out.println();
                        System.out.println("Dr. Nefario (mucho después):");
                        System.out.println("\"Nadie sabe su nombre, pero sin él... no estaríamos aquí.");
                        System.out.println("El primero que se atrevió a enfrentarlo, el que pagó el precio más alto.\"");
                        System.out.println();
                        System.out.println("Consecuencia: Mueres, pero tu sacrificio inspira a otros.");
                        System.out.println("Décadas después, gracias a ti, la maldición será destruida definitivamente.");
                        System.out.println("Eres el héroe olvidado… pero el más importante.");
                        //La variable se guarda como true, pierde
                        perdioCombate = true;
                        break;
                    case 1:
                    //Imprimir Final Agrio con 1 vida
                        System.out.println("Logras herir gravemente a Sukuna, pero no lo destruyes del todo.");
                        System.out.println("Usas el artefacto para sellarlo en el fondo de la cueva… pero pagas un precio terrible.");
                        System.out.println("Narrador: Con tu última fuerza, completas el ritual.");
                        System.out.println("El artefacto se activa y encierra a Sukuna, pero la explosión de energía te lanza contra una pared.");
                        System.out.println();
                        System.out.println("Dr. Nefario (al encontrarte):");
                        System.out.println("\"No pudiste destruirlo… pero lo detuviste. El mundo te debe una.");
                        System.out.println("Descansa, héroe.\"");
                        System.out.println();
                        System.out.println("Consecuencia: Sobrevives… pero apenas. Quedas atrapado o maldito.");
                        System.out.println("Eres recordado como quien detuvo a Sukuna, aunque no lo destruyó.");
                        System.out.println("El miedo de que vuelva siempre acechará a Skypea.");
                        //La variable se guarda como true, pierde
                        perdioCombate = true;
                        break;
                    case 2:
                    //FInal Determinante con 2 vidas
                        System.out.println("Derrotas a Sukuna tras una batalla feroz, pero quedas al borde del colapso.");
                        System.out.println("El artefacto hace su trabajo, pero se rompe al final, liberando una chispa de oscuridad que se adentra en ti.");
                        System.out.println("Narrador: La isla es libre, pero algo ha cambiado dentro de ti.");
                        System.out.println("Una sombra se esconde ahora en lo más profundo de tu alma.");
                        System.out.println();
                        System.out.println("Dr. Nefario:");
                        System.out.println("\"Gracias por salvarme... pero temo que parte de Sukuna ahora vive en ti.");
                        System.out.println("La maldición no murió… solo cambió de huésped.\"");
                        System.out.println();
                        System.out.println("Consecuencia: Eres visto como un héroe, pero el precio fue alto.");
                        System.out.println("Tu lucha no ha terminado… ahora empieza una interna.");
                        System.out.println("¿Podrás resistir el poder maldito que habita en ti?");
                        //La variable se guarda como true, gana el juego
                        ganoCombate = true;
                        break;
                    case 3:
                    //Imprimir Final Epico con tres vidas
                        System.out.println("Con fuerza, estrategia y valentía, logras vencer a Sukuna sin apenas recibir daño.");
                        System.out.println("El artefacto brilla intensamente, absorbe toda la energía maldita y la sella para siempre.");
                        System.out.println("El trono de obsidiana se desmorona, y el aire pesado de la cueva se disipa.");
                        System.out.println("Narrador: Sientes cómo la maldición abandona la isla.");
                        System.out.println("La luz natural vuelve a fluir por las grietas del techo, revelando un cielo dorado sobre Skypea.");
                        System.out.println();
                        System.out.println("Dr. Nefario:");
                        System.out.println("\"¡Lo lograste! Has salvado esta isla y a todos sus habitantes.");
                        System.out.println("A partir de hoy, serás recordado como el héroe que liberó Skypea.\"");
                        System.out.println();
                        System.out.println("Consecuencia: Eres proclamado el Guardián de la Isla, protector de su legado y su tesoro oculto.");
                        System.out.println("Skypea prospera bajo tu protección... y la historia de tu hazaña se cuenta por generaciones.");
                        //La variable se guarda como true, gana el juego
                        ganoCombate = true;
                        break;
                    default:
                        System.out.println("Lo siento sucedio un error");;
                        break;
                }
        }
        //return valor boolean ganoCombate
        return ganoCombate; 
    }
    //Funcion para realizar la accion del Invenatrio, leer y actualizar
    static public String[] Inventario(String[] V) throws Exception{
    int opcion = 0;
        while (opcion !=3) { System.in.read();

            // ------------------------------------------------------
            // ---------- Presentacion del Menu Principal -----------
            // ------------------------------------------------------
            out.println("-------------------------------------------------");
            out.println("                  Menú Inventario              ");
            out.println("-------------------------------------------------");
            out.println("   1- Lista de Inventario");
            out.println("   2- Actualizar Inventario");
            out.println("   3- Salir");
            out.println("-------------------------------------------------");
            out.println("*** Recordatorio: Despues de cada opcion tiene que presionar dos veces ENTER para continuar");
            out.println("");
                // Obtener del Operador la Opcion seleccionada
            opcion = Integer.parseInt(in.readLine()); 
                switch (opcion) {
                    case 1:
                        // Llamar a Funcion Listar el inventario
                        Listar(V);
                    break;
                    case 2:
                        // Llamar a Funcion Actualizar para que pueda aggregar o cambiar un elemento del Inventario
                        Actualizar(V);
                    break;
                    case 3:
                        //El programa se cierra y muestra un mensaje
                        System.out.println("Saliendo del Programa...");
                    break;
                    default:
                        out.println("Por favor Ingrese un valor del Menú Principal");
                    break;
                }System.in.read();
        }
        return V;
    }
    // Esta funcion se encarga de Imprimir en Consola el Inventario del jugador
    public static String[] Listar(String[] V)throws Exception{
        int indiceInventario = 0;
        //Imprimir encabezado
        out.println("");
        out.println("-------------------------------------------------");
        out.println("Su Inventario:");
        out.println("-------------------------------------------------");
        out.println("");
        //Proceso
        for (int i = 0; i < V.length; i++) {
            
            indiceInventario = i + 1;

            out.println(indiceInventario + "- " + V[i] );
        }
        return V;

    }
    // Esta funcoion se encarga de actualizar el Iventario, que el usuario pueda cambiar los elementos
    public static String[] Actualizar(String[] V) throws Exception{

        int i = 0;

        // Llamar a Listar. 
        Listar(V);

        // Leer el índice del Arreglo
        out.println("Por favor el numero de Elemento el a modificar:");
        out.println("");
        i = Integer.parseInt(in.readLine());  


        out.println("");
        out.println("Indique el nuevo elemento:");
        out.println("");

        // Actualizar el Valor en el índice correspondiente.
        V[i-1] = in.readLine();
        return V;

    }

}