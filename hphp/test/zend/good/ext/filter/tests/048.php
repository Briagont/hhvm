<?hh
function hex_inc($s) :mixed{
    $len = strlen($s);
    while ($len > 0) {
        $len--;
        if ($s[$len] != 'f') {
            if ($s[$len] == '9') {
                $s[$len] = 'a';
            } else {
                $s[$len] = HH\Lib\Legacy_FIXME\cast_for_arithmetic($s[$len]) + 1;
            }
            return $s;
        }
        $s[$len] = '0';
    }
    return '1'.$s;
}

<<__EntryPoint>> function main(): void {
$s = sprintf("%x", PHP_INT_MAX);
var_dump(is_long(filter_var('0x'.$s, FILTER_VALIDATE_INT, dict["flags"=>FILTER_FLAG_ALLOW_HEX])));

$s = hex_inc($s);
var_dump(is_long(filter_var('0x'.$s, FILTER_VALIDATE_INT, dict["flags"=>FILTER_FLAG_ALLOW_HEX])));

$s = sprintf("%x", ~0);
var_dump(is_long(filter_var('0x'.$s, FILTER_VALIDATE_INT, dict["flags"=>FILTER_FLAG_ALLOW_HEX])));

$s = hex_inc($s);
var_dump(filter_var('0x'.$s, FILTER_VALIDATE_INT, dict["flags"=>FILTER_FLAG_ALLOW_HEX]));
}
