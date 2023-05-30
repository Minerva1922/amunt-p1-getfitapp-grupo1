<script>
    import { Router, Link, Route } from 'svelte-routing';
    import QuienesSomos from "./components/QuienesSomos.svelte";
    import QueHacemos from "./components/QueHacemos.svelte";
    import Servicios from "./components/Servicios.svelte";
    import Ofertas from "./components/Ofertas.svelte";
    import Registrate from "./components/Registrate.svelte";
</script>

<main>
    <header>
      <nav>
        <Router>
            <Route path="/" component={QuienesSomos} />
            <Route path="/quienes-somos" component={QuienesSomos} />
            <Route path="/que-hacemos" component={QueHacemos} />
            <Route path="/servicios" component={Servicios} />
            <Route path="/ofertas" component={Ofertas} />
        </Router>
      </nav>
        <img src="\src\assets\logo getfiteasy.png" height="60" width="130" alt="logo"/>

        <nav>
            <ul>
                <li><a href="/quienes-somos">Quiénes Somos</a></li>
                <li><a href="/que-hacemos">Qué Hacemos</a></li>
                <li class="submenu-padre">
                    <a href="/servicios">Servicios</a>
                    <ul class="submenu">
                        <li><a href="/servicios">Servicios</a></li>
                        <li><a href="/ofertas">Ofertas</a></li>
                    </ul>
                <li><a href="/registrate">Registrar</a></li>
            </ul>
        </nav>

    </header>

    <!--
      <nav>
          <Link to ="/">Quienes Somos </Link>
          <Link to ="/">Que Hacemos </Link>
          <Link to ="/">Servicios </Link>
          <Link to ="/">Ofertas </Link>
          <Link to ="/">Registrate </Link>
      </nav>
    -->



    <footer>
        <section class="footer-registrate">
            <div class="left-section">
                <h3>Mantente al día</h3>
                <p>Regístrate para enterarte de las clases nuevas y los servicios adicionales antes que nadie.<br> Respetamos tu privacidad y nunca compartiremos información con proveedores externos.</p>
            </div>
            <div class="right-section">
                <input type="text" placeholder="Correo Electrónico" />
                <button onclick="window.location.href=`/registrate`">Registrarse</button>
            </div>
        </section>
        <hr><br>
        <section class="footer-column-cajon">
            <div class="footer-column">
                <h3>Ayuda</h3>
                    <ul>
                        <li>Términos y Condiciones</li>
                        <li>Políticas de Privacidad</li>
                        <li>Preguntas Frecuentes</li>
                    </ul>
            </div>
            <div class="footer-column">
                <h3>Contacto</h3>
                <p>getfiteasy@gmail.com</p>
            </div>
            <div class="footer-column-redes">
                <svg fill="#000000" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid" width="20" height="20"
                     viewBox="0 0 31.812 26">
                    <path d="M20.877,2.000 C22.519,2.000 24.382,2.652 25.426,3.738 C26.724,3.486 27.949,3.025 29.050,2.386 C28.625,3.687 27.718,4.779 26.540,5.469 C27.693,5.332 28.797,5.035 29.820,4.590 C29.054,5.707 28.087,6.690 26.971,7.477 C26.981,7.715 26.987,7.955 26.987,8.195 C26.987,15.562 21.445,24.000 10.939,24.000 C7.715,24.000 4.507,23.133 1.982,21.551 C2.428,21.605 2.883,21.631 3.343,21.631 C6.019,21.631 8.482,20.740 10.439,19.242 C7.937,19.199 5.827,17.586 5.103,15.373 C5.450,15.437 5.810,15.473 6.178,15.473 C6.696,15.473 7.203,15.406 7.681,15.277 C5.068,14.768 3.100,12.514 3.100,9.813 C3.100,9.787 3.100,9.764 3.100,9.740 C3.871,10.158 4.750,10.410 5.687,10.440 C4.154,9.437 3.147,7.734 3.147,5.799 C3.147,4.777 3.428,3.818 3.919,2.998 C6.735,6.367 10.945,8.588 15.693,8.822 C15.594,8.414 15.543,7.984 15.543,7.553 C15.543,4.473 17.721,2.000 20.877,2.000 M29.820,4.590 L29.825,4.590 M20.877,-0.000 C17.033,-0.000 14.060,2.753 13.614,6.552 C10.425,5.905 7.524,4.204 5.440,1.711 C5.061,1.257 4.503,0.998 3.919,0.998 C3.867,0.998 3.815,1.000 3.763,1.004 C3.123,1.055 2.547,1.413 2.216,1.966 C1.525,3.122 1.159,4.447 1.159,5.799 C1.159,6.700 1.321,7.579 1.625,8.400 C1.300,8.762 1.113,9.238 1.113,9.740 L1.113,9.813 C1.113,11.772 1.882,13.589 3.160,14.952 C3.087,15.294 3.103,15.655 3.215,15.998 C3.657,17.348 4.459,18.510 5.499,19.396 C4.800,19.552 4.079,19.631 3.343,19.631 C2.954,19.631 2.577,19.609 2.222,19.565 C2.141,19.556 2.061,19.551 1.981,19.551 C1.148,19.551 0.391,20.078 0.108,20.886 C-0.202,21.770 0.140,22.753 0.932,23.249 C3.764,25.023 7.318,26.000 10.939,26.000 C17.778,26.000 22.025,22.843 24.383,20.195 C27.243,16.984 28.907,12.718 28.972,8.455 C29.899,7.682 30.717,6.790 31.410,5.792 C31.661,5.458 31.810,5.041 31.810,4.590 C31.810,3.909 31.473,3.308 30.958,2.946 C31.181,2.176 30.925,1.342 30.303,0.833 C29.940,0.537 29.496,0.386 29.049,0.386 C28.708,0.386 28.365,0.474 28.056,0.654 C27.391,1.040 26.680,1.344 25.931,1.562 C24.555,0.592 22.688,-0.000 20.877,-0.000 L20.877,-0.000 Z"/>
                </svg>
                <svg width="20" height="20" viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                    <path fill-rule="evenodd" clip-rule="evenodd" d="M2 6C2 3.79086 3.79086 2 6 2H18C20.2091 2 22 3.79086 22 6V18C22 20.2091 20.2091 22 18 22H6C3.79086 22 2 20.2091 2 18V6ZM6 4C4.89543 4 4 4.89543 4 6V18C4 19.1046 4.89543 20 6 20H18C19.1046 20 20 19.1046 20 18V6C20 4.89543 19.1046 4 18 4H6ZM12 9C10.3431 9 9 10.3431 9 12C9 13.6569 10.3431 15 12 15C13.6569 15 15 13.6569 15 12C15 10.3431 13.6569 9 12 9ZM7 12C7 9.23858 9.23858 7 12 7C14.7614 7 17 9.23858 17 12C17 14.7614 14.7614 17 12 17C9.23858 17 7 14.7614 7 12ZM17.5 8C18.3284 8 19 7.32843 19 6.5C19 5.67157 18.3284 5 17.5 5C16.6716 5 16 5.67157 16 6.5C16 7.32843 16.6716 8 17.5 8Z" fill="#000000"/>
                </svg>

                <svg width="20" height="20" viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                    <path fill-rule="evenodd" clip-rule="evenodd" d="M2 6C2 3.79086 3.79086 2 6 2H18C20.2091 2 22 3.79086 22 6V18C22 20.2091 20.2091 22 18 22H6C3.79086 22 2 20.2091 2 18V6ZM6 4C4.89543 4 4 4.89543 4 6V18C4 19.1046 4.89543 20 6 20H12V13H11C10.4477 13 10 12.5523 10 12C10 11.4477 10.4477 11 11 11H12V9.5C12 7.567 13.567 6 15.5 6H16.1C16.6523 6 17.1 6.44772 17.1 7C17.1 7.55228 16.6523 8 16.1 8H15.5C14.6716 8 14 8.67157 14 9.5V11H16.1C16.6523 11 17.1 11.4477 17.1 12C17.1 12.5523 16.6523 13 16.1 13H14V20H18C19.1046 20 20 19.1046 20 18V6C20 4.89543 19.1046 4 18 4H6Z" fill="#000000"/>
                </svg>
            </div>
        </section>
    </footer>
</main>

<style>
    main {
        display: flex;
        flex-direction: column;
        justify-content: space-between;
    }

    header {
        display: flex;
        align-items: center;
        justify-content: space-between;
        padding: 30px;
    }

    img {
        margin-right: 20px;
    }

    nav ul {
        display: flex;
        list-style: none;
        font-size: 15px;
    }

    nav ul li {
        margin-left: 20px;
    }

    nav ul li:first-child {
        margin-left: 0;
    }

    nav ul li a {
        text-decoration: none;
        color: black;
    }

    .submenu {
        display: none;
        position: absolute;
        background-color: #f9f9f9;
        padding: 10px;
        min-width: 150px;
    }

    .submenu-padre:hover .submenu {
        display: block;
    }

    .submenu li {
        margin-bottom: 5px;
    }

    footer {
        position: fixed;
        bottom: 0;
        padding: 20px;
        width: 100%;
        left:0;
    }

    .footer-registrate{
        display: flex;
        justify-content: space-between;
        margin-bottom: 20px;
    }
    .footer-column-cajon{
        display: flex;
        align-items: flex-start;
    }

    .footer-column ul{
        list-style-type:  none;
    }

    .footer-column{
        margin-right: 30px;
    }

    .footer-column-redes{
        margin-left: 70%;
        margin-bottom: 40px;
    }


   button{
       width: 150px;
       height: 50px;
       border-radius: 20px;
   }
   input{
       width: 200px;
       height: 50px;
   }
</style>


