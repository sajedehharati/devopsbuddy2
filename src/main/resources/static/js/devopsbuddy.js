/**
 * Created by adminuser on 7/7/17.
 */
$(document).ready(main);
function main(){
    $('.btn-collapse').click(function (e) {
        e.preventDefault();
        var $this=$(this);
        var $collapse = $this.closest('.colapse-group').find('.collapse');
        $collapse.collapse('toggle');

    })
}
