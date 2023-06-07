<script>
    import {navigate} from "svelte-routing";

    function irAMadrid() {
        navigate("/madrid")
    }

    function irABarcelona() {
        navigate("/barcelona")
    }
</script>


<section>
    <h1>Bienvenido Ali Siam</h1>
    <div>
        <button on:click|preventDefault={irABarcelona}>Barcelona</button>
        <button on:click|preventDefault={irAMadrid}>Madrid</button>
    </div>
</section>

<style>
    section {
        max-width: 800px;
        margin: 40px auto;
    }

    h1 {
        color: #254e5f;
        text-align: center;
        font-size: 50px;
    }

    button {
        margin-top: 50px;
        width: 200px;
        height: 60px;
        border-radius: 30px;
        background-color: white;
        font-size: 15px;
        margin-inside: 40px;
    }

    button:hover {
        background-color: #02b2ec;
        color: white;
    }
</style>