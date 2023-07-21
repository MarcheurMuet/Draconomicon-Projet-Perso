let header = document.getElementById("head");
let activePage = document.getElementsByTagName("h1");
console.log(activePage[0].outerText=="Connexion");
header.innerHTML= 
    `
        <div id="titre">
            <a href="index.html" id="lienAcceuil">
                <img src="images/draconomicon.png" id="draconomicon">
            </a>
        </div>
        <nav>
            <a href="inscription.html">
                <img src="images/onglet.png" alt="parchemin déchiré" class="longP">
                <img src="images/ongletFocus.svg" alt="rectangle rouge" class="ongletFocus" ${activePage[0].outerText=='Inscription' ? 'id="focus"' : ''}>
                <p>Inscription</p>
            </a>
            <a href="connexion.html">
                <img src="images/onglet.png" alt="parchemin déchiré" class="longP">
                <img src="images/ongletFocus.svg" alt="rectangle rouge" class="ongletFocus" ${activePage[0].outerText=='Connexion' ? 'id="focus"' : ''}>
                <p>Connexion</p>
            </a>
            <a href="encyclopedie.html">
                <img src="images/onglet.png" alt="parchemin déchiré" class="longP">
                <img src="images/ongletFocus.svg" alt="rectangle rouge" class="ongletFocus" ${activePage[0].outerText=='Encyclopédie' ? 'id="focus"' : ''}>
                <p>Encyclopédie</p>
            </a>
            
            <a href="blogselect.html">
                <img src="images/onglet.png" alt="parchemin déchiré">
                <img src="images/ongletFocus.svg" alt="rectangle rouge" class="ongletFocus" ${activePage[0].outerText=='Blog' ? 'id="focus"' : ''}>
                <p>Blog</p>
            </a>
            <img src="images/icone.png" id="burger">
        </nav>        
    `

let footer = document.getElementById("foot");
footer.innerHTML = 
    `
        <div id="bot">
            <h3>Crée par Rémi Estaque</h3>
            <a href="index.html" id="lienAcceuil">
                <img src="images/GoogleApp.png" id="GoogleAds">
            </a>
        </div>
    `
