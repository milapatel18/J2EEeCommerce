function ERP (theName, theEmail) {
    this.name = theName;
    this.email = theEmail;
    this.quizScores = [];
    this.currentScore = 0;
}

ERP.prototype = {
    constructor: ERP,
    logoutFormSubmit:function (theScoreToAdd)  {
        document.getElementById("logoutForm").submit();
    }
}/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


