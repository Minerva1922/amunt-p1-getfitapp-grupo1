<script>

</script>

<main>
    <header>
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
                </li>
                <li><a href="/blog">Blog</a></li>
                <li><a href="/registrate">Registrar</a></li>
            </ul>
        </nav>
    </header>

    <footer>
        <section class="footer-registrate">
            <div class="left-section">
                <h3>Mantente al día</h3>
                <p>Regístrate para enterarte de las clases nuevas y los servicios adicionales antes que nadie. Respetamos tu privacidad y nunca compartiremos información con proveedores externos.</p>
            </div>
            <div class="right-section">
                <input type="text" placeholder="Correo Electrónico" />
                <button onclick="window.location.href=`/registrate`">Registrarse</button>
            </div>
        </section>
        <hr><br>
        <section class="footer-column">
            <div class="ayuda">
                <h3>Ayuda</h3>
                    <ul>
                        <li>Términos y Condiciones</li>
                        <li>Políticas de Privacidad</li>
                        <li>Preguntas Frecuentes</li>
                    </ul>
            </div>
            <div class="contacto">
                <h3>Contacto</h3>
                <p>getfiteasy@gmail.com</p>
            </div>
            <div class="redes">
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
    }
</style>


