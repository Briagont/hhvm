<?hh
<<file:__EnableUnstableFeatures('like_type_hints')>>

class C<T> {}
class D {}

<<__EntryPoint>>
function main(): void {
    $c = new C();
    $c as ~C<_>;
    $c as ~D;
}
