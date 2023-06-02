<script>
    import Calendario from "../components/Calendario.svelte";
    import Clases from "../components/Clases.svelte";
</script>

<div class="dia">
    <Calendario dia="LUNES"/>
    <div class="clases-diarias">
        <Clases hora="19h-20h" nombre="BOXEO" instructor="INSTRUCTOR: AARON HUGHES" sede="SEDE: Madrid"/>
        <Clases hora="19h-20h" nombre="PILATES" instructor="INSTRUCTORA: NICOLE WINTER" sede="SEDE: Barcelona"/>
    </div>
</div>
<hr>
<div class="dia">
    <Calendario dia="MARTES"/>
    <div class="clases-diarias">
        <Clases hora="16h-19h" nombre="YOGA" instructor="INSTRUCTORA: ALIYAH WILLIAMS" sede="SEDE:Madrid"/>
        <Clases hora="19h-20h" nombre="CARDIO" instructor="INSTRUCTORA: NICOLE WINTER" sede="SEDE: Barcelona"/>
    </div>
</div>
<hr>
<div class="dia">
    <Calendario dia="MIERCOLES"/>
    <div class="clases-diarias">
        <Clases hora="16h-19h" nombre="GAP" instructor="INSTRUCTORA: NICOLE WINTER" sede="SEDE:Madrid"/>
        <Clases hora="19h-20h" nombre="ZUMBA" instructor="INSTRUCTORA: TESHIA MILLER" sede="SEDE: Barcelona"/>
    </div>
</div>
<hr>
<div class="dia">
    <Calendario dia="JUEVES"/>
    <div class="clases-diarias">
        <Clases hora="16h-19h" nombre="CARDIO" instructor="INSTRUCTOR: OMAR HARRIS" sede="Madrid"/>
        <Clases hora="19h-20h" nombre="BOXEO" instructor="INSTRUCTORA: TESHIA MILLER" sede="SEDE:Barcelona"/>
    </div>
</div>
<hr>
<div class="dia">
    <Calendario dia="VIERNES"/>
    <div class="clases-diarias">
        <Clases hora="16h-19h" nombre="ZUMBA" instructor="INSTRUCTOR: OMAR HARRIS" sede="Madrid"/>
        <Clases hora="19h-20h" nombre="BOXEO" instructor="INSTRUCTORA: Minerva" sede="SEDE: Barcelona"/>
    </div>
</div>
<hr>
<div class="dia">
    <Calendario dia="SABADO"/>
    <div class="clases-diarias">
        <Clases hora="16h-19h" nombre="YOGA" instructor="INSTRUCTOR: OMAR HARRIS" sede="Madrid"/>
        <Clases hora="19h-20h" nombre="BOXEO" instructor="INSTRUCTORA: TESHIA MILLER" sede="SEDE: Barcelona"/>
    </div>
</div>
<hr>
<div class="dia">
    <Calendario dia="DOMINGO"/>
    <div class="clases-diarias">
        <Clases hora="16h-19h" nombre="CARDIO" instructor="INSTRUCTOR: OMAR HARRIS" sede="Madrid"/>
        <Clases hora="19h-20h" nombre="BOXEO" instructor="INSTRUCTORA: NICOLE WINTER" sede="SEDE: Barcelona"/>
    </div>
</div>

<style>
    @import url('https://fonts.googleapis.com/css2?family=Anton&family=Roboto+Condensed:ital,wght@0,300;0,400;0,700;1,300;1,400;1,700&display=swap');


   body{

    font-family: 'Anton', sans-serif;
   }

    .dia {
        margin-top:100px;
        display: flex;
        width: 100%;
        height: 400px;
        text-align: center;

    }

    .clases-diarias {
        display: flex;
        width: 100%;
        height: 400px;
        flex-direction: column;
        justify-content: center;
        align-items: flex-end;
        text-align: initial;



    }


</style>