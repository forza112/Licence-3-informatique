/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.node;

import sc.analysis.*;

@SuppressWarnings("nls")
public final class AAvecparamListeparam extends PListeparam
{
    private TParentheseOuvrante _parentheseOuvrante_;
    private PListedecvar _listedecvar_;
    private TParentheseFermante _parentheseFermante_;

    public AAvecparamListeparam()
    {
        // Constructor
    }

    public AAvecparamListeparam(
        @SuppressWarnings("hiding") TParentheseOuvrante _parentheseOuvrante_,
        @SuppressWarnings("hiding") PListedecvar _listedecvar_,
        @SuppressWarnings("hiding") TParentheseFermante _parentheseFermante_)
    {
        // Constructor
        setParentheseOuvrante(_parentheseOuvrante_);

        setListedecvar(_listedecvar_);

        setParentheseFermante(_parentheseFermante_);

    }

    @Override
    public Object clone()
    {
        return new AAvecparamListeparam(
            cloneNode(this._parentheseOuvrante_),
            cloneNode(this._listedecvar_),
            cloneNode(this._parentheseFermante_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAvecparamListeparam(this);
    }

    public TParentheseOuvrante getParentheseOuvrante()
    {
        return this._parentheseOuvrante_;
    }

    public void setParentheseOuvrante(TParentheseOuvrante node)
    {
        if(this._parentheseOuvrante_ != null)
        {
            this._parentheseOuvrante_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parentheseOuvrante_ = node;
    }

    public PListedecvar getListedecvar()
    {
        return this._listedecvar_;
    }

    public void setListedecvar(PListedecvar node)
    {
        if(this._listedecvar_ != null)
        {
            this._listedecvar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._listedecvar_ = node;
    }

    public TParentheseFermante getParentheseFermante()
    {
        return this._parentheseFermante_;
    }

    public void setParentheseFermante(TParentheseFermante node)
    {
        if(this._parentheseFermante_ != null)
        {
            this._parentheseFermante_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parentheseFermante_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._parentheseOuvrante_)
            + toString(this._listedecvar_)
            + toString(this._parentheseFermante_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._parentheseOuvrante_ == child)
        {
            this._parentheseOuvrante_ = null;
            return;
        }

        if(this._listedecvar_ == child)
        {
            this._listedecvar_ = null;
            return;
        }

        if(this._parentheseFermante_ == child)
        {
            this._parentheseFermante_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._parentheseOuvrante_ == oldChild)
        {
            setParentheseOuvrante((TParentheseOuvrante) newChild);
            return;
        }

        if(this._listedecvar_ == oldChild)
        {
            setListedecvar((PListedecvar) newChild);
            return;
        }

        if(this._parentheseFermante_ == oldChild)
        {
            setParentheseFermante((TParentheseFermante) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}